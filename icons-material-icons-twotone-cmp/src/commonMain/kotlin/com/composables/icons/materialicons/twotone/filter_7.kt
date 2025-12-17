package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Filter_7: ImageVector
    get() {
        if (_Filter_7 != null) return _Filter_7!!
        
        _Filter_7 = ImageVector.Builder(
            name = "filter_7",
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
                moveTo(7f, 17f)
                horizontalLineToRelative(14f)
                verticalLineTo(3f)
                horizontalLineTo(7f)
                verticalLineToRelative(14f)
                close()
                moveToRelative(4f, -10f)
                verticalLineTo(5f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(2f)
                lineToRelative(-4f, 8f)
                horizontalLineToRelative(-2f)
                lineToRelative(4f, -8f)
                horizontalLineToRelative(-4f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(3f, 23f)
                horizontalLineToRelative(16f)
                verticalLineToRelative(-2f)
                horizontalLineTo(3f)
                verticalLineTo(5f)
                horizontalLineTo(1f)
                verticalLineToRelative(16f)
                curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                close()
                moveToRelative(10f, -8f)
                lineToRelative(4f, -8f)
                verticalLineTo(5f)
                horizontalLineToRelative(-6f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(4f)
                lineToRelative(-4f, 8f)
                close()
                moveToRelative(8f, -14f)
                horizontalLineTo(7f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                verticalLineToRelative(14f)
                curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                horizontalLineToRelative(14f)
                curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                verticalLineTo(3f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                close()
                moveToRelative(0f, 16f)
                horizontalLineTo(7f)
                verticalLineTo(3f)
                horizontalLineToRelative(14f)
                verticalLineToRelative(14f)
                close()
            }
        }.build()
        
        return _Filter_7!!
    }

private var _Filter_7: ImageVector? = null

