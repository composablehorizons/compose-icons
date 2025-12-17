package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.Format_bold: ImageVector
    get() {
        if (_Format_bold != null) return _Format_bold!!
        
        _Format_bold = ImageVector.Builder(
            name = "format_bold",
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
                moveTo(15.6f, 10.79f)
                curveToRelative(0.97f, -0.67f, 1.65f, -1.77f, 1.65f, -2.79f)
                curveToRelative(0f, -2.26f, -1.75f, -4f, -4f, -4f)
                horizontalLineTo(7f)
                verticalLineToRelative(14f)
                horizontalLineToRelative(7.04f)
                curveToRelative(2.09f, 0f, 3.71f, -1.7f, 3.71f, -3.79f)
                curveToRelative(0f, -1.52f, -0.86f, -2.82f, -2.15f, -3.42f)
                close()
                moveTo(10f, 6.5f)
                horizontalLineToRelative(3f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-3f)
                close()
                moveToRelative(3.5f, 9f)
                horizontalLineTo(10f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(3.5f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                close()
            }
        }.build()
        
        return _Format_bold!!
    }

private var _Format_bold: ImageVector? = null

