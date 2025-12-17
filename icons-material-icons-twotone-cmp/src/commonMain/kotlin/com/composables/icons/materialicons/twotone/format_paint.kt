package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Format_paint: ImageVector
    get() {
        if (_Format_paint != null) return _Format_paint!!
        
        _Format_paint = ImageVector.Builder(
            name = "format_paint",
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
                moveTo(6f, 4f)
                horizontalLineToRelative(10f)
                verticalLineToRelative(2f)
                horizontalLineTo(6f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(17f, 2f)
                horizontalLineTo(5f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                verticalLineToRelative(4f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(12f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                verticalLineTo(6f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(4f)
                horizontalLineTo(9f)
                verticalLineToRelative(11f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(2f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                verticalLineToRelative(-9f)
                horizontalLineToRelative(8f)
                verticalLineTo(4f)
                horizontalLineToRelative(-3f)
                verticalLineTo(3f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                close()
                moveToRelative(-1f, 4f)
                horizontalLineTo(6f)
                verticalLineTo(4f)
                horizontalLineToRelative(10f)
                verticalLineToRelative(2f)
                close()
            }
        }.build()
        
        return _Format_paint!!
    }

private var _Format_paint: ImageVector? = null

