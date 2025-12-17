package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Call_to_action: ImageVector
    get() {
        if (_Call_to_action != null) return _Call_to_action!!
        
        _Call_to_action = ImageVector.Builder(
            name = "call_to_action",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Transparent)
            ) {
                moveTo(0f, 0f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(24f)
                horizontalLineTo(0f)
                verticalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(3f, 19f)
                horizontalLineToRelative(18f)
                verticalLineTo(5f)
                horizontalLineTo(3f)
                verticalLineToRelative(14f)
                close()
                moveToRelative(2f, -4f)
                horizontalLineToRelative(14f)
                verticalLineToRelative(3f)
                horizontalLineTo(5f)
                verticalLineToRelative(-3f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(21f, 3f)
                horizontalLineTo(3f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                verticalLineToRelative(14f)
                curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                horizontalLineToRelative(18f)
                curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                verticalLineTo(5f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                close()
                moveToRelative(0f, 16f)
                horizontalLineTo(3f)
                verticalLineTo(5f)
                horizontalLineToRelative(18f)
                verticalLineToRelative(14f)
                close()
                moveTo(5f, 15f)
                horizontalLineToRelative(14f)
                verticalLineToRelative(3f)
                horizontalLineTo(5f)
                close()
            }
        }.build()
        
        return _Call_to_action!!
    }

private var _Call_to_action: ImageVector? = null

