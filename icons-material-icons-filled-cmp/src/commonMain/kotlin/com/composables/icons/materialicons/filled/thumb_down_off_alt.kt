package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Thumb_down_off_alt: ImageVector
    get() {
        if (_Thumb_down_off_alt != null) return _Thumb_down_off_alt!!
        
        _Thumb_down_off_alt = ImageVector.Builder(
            name = "thumb_down_off_alt",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Transparent)
            ) {
                moveTo(24f, 24f)
                horizontalLineTo(0f)
                verticalLineTo(0f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(24f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(10.89f, 18.28f)
                lineToRelative(0.57f, -2.89f)
                curveToRelative(0.12f, -0.59f, -0.04f, -1.2f, -0.42f, -1.66f)
                curveToRelative(-0.38f, -0.46f, -0.94f, -0.73f, -1.54f, -0.73f)
                horizontalLineTo(4f)
                verticalLineToRelative(-1.08f)
                lineTo(6.57f, 6f)
                horizontalLineToRelative(8.09f)
                curveToRelative(0.18f, 0f, 0.34f, 0.16f, 0.34f, 0.34f)
                verticalLineToRelative(7.84f)
                lineToRelative(-4.11f, 4.1f)
                moveTo(10f, 22f)
                lineToRelative(6.41f, -6.41f)
                curveToRelative(0.38f, -0.38f, 0.59f, -0.89f, 0.59f, -1.42f)
                verticalLineTo(6.34f)
                curveTo(17f, 5.05f, 15.95f, 4f, 14.66f, 4f)
                horizontalLineToRelative(-8.1f)
                curveToRelative(-0.71f, 0f, -1.36f, 0.37f, -1.72f, 0.97f)
                lineToRelative(-2.67f, 6.15f)
                curveToRelative(-0.11f, 0.25f, -0.17f, 0.52f, -0.17f, 0.8f)
                verticalLineTo(13f)
                curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                horizontalLineToRelative(5.5f)
                lineToRelative(-0.92f, 4.65f)
                curveToRelative(-0.05f, 0.22f, -0.02f, 0.46f, 0.08f, 0.66f)
                curveToRelative(0.23f, 0.45f, 0.52f, 0.86f, 0.88f, 1.22f)
                lineTo(10f, 22f)
                close()
                moveToRelative(10f, -7f)
                horizontalLineToRelative(2f)
                verticalLineTo(4f)
                horizontalLineToRelative(-2f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                verticalLineToRelative(9f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                close()
            }
        }.build()
        
        return _Thumb_down_off_alt!!
    }

private var _Thumb_down_off_alt: ImageVector? = null

