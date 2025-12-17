package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.View_in_ar: ImageVector
    get() {
        if (_View_in_ar != null) return _View_in_ar!!
        
        _View_in_ar = ImageVector.Builder(
            name = "view_in_ar",
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
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(18.25f, 7.6f)
                lineToRelative(-5.5f, -3.18f)
                curveToRelative(-0.46f, -0.27f, -1.04f, -0.27f, -1.5f, 0f)
                lineTo(5.75f, 7.6f)
                curveToRelative(-0.46f, 0.27f, -0.75f, 0.76f, -0.75f, 1.3f)
                verticalLineToRelative(6.35f)
                curveToRelative(0f, 0.54f, 0.29f, 1.03f, 0.75f, 1.3f)
                lineToRelative(5.5f, 3.18f)
                curveToRelative(0.46f, 0.27f, 1.04f, 0.27f, 1.5f, 0f)
                lineToRelative(5.5f, -3.18f)
                curveToRelative(0.46f, -0.27f, 0.75f, -0.76f, 0.75f, -1.3f)
                verticalLineTo(8.9f)
                curveToRelative(0f, -0.54f, -0.29f, -1.03f, -0.75f, -1.3f)
                close()
                moveTo(7f, 14.96f)
                verticalLineToRelative(-4.62f)
                lineToRelative(4f, 2.32f)
                verticalLineToRelative(4.61f)
                lineToRelative(-4f, -2.31f)
                close()
                moveToRelative(5f, -4.03f)
                lineTo(8f, 8.61f)
                lineToRelative(4f, -2.31f)
                lineToRelative(4f, 2.31f)
                lineToRelative(-4f, 2.32f)
                close()
                moveToRelative(1f, 6.34f)
                verticalLineToRelative(-4.61f)
                lineToRelative(4f, -2.32f)
                verticalLineToRelative(4.62f)
                lineToRelative(-4f, 2.31f)
                close()
                moveTo(7f, 2f)
                horizontalLineTo(3.5f)
                curveTo(2.67f, 2f, 2f, 2.67f, 2f, 3.5f)
                verticalLineTo(7f)
                horizontalLineToRelative(2f)
                verticalLineTo(4f)
                horizontalLineToRelative(3f)
                verticalLineTo(2f)
                close()
                moveToRelative(10f, 0f)
                horizontalLineToRelative(3.5f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                verticalLineTo(7f)
                horizontalLineToRelative(-2f)
                verticalLineTo(4f)
                horizontalLineToRelative(-3f)
                verticalLineTo(2f)
                close()
                moveTo(7f, 22f)
                horizontalLineTo(3.5f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                verticalLineTo(17f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(2f)
                close()
                moveToRelative(10f, 0f)
                horizontalLineToRelative(3.5f)
                curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
                verticalLineTo(17f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(2f)
                close()
            }
        }.build()
        
        return _View_in_ar!!
    }

private var _View_in_ar: ImageVector? = null

