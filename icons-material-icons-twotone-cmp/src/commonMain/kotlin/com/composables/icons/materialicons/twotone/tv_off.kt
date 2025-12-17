package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Tv_off: ImageVector
    get() {
        if (_Tv_off != null) return _Tv_off!!
        
        _Tv_off = ImageVector.Builder(
            name = "tv_off",
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
                horizontalLineToRelative(13.46f)
                lineToRelative(-12f, -12f)
                horizontalLineTo(3f)
                close()
                moveToRelative(7.12f, -12f)
                lineTo(21f, 17.88f)
                verticalLineTo(7f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(21f, 7f)
                verticalLineToRelative(10.88f)
                lineToRelative(1.85f, 1.85f)
                curveToRelative(0.09f, -0.23f, 0.15f, -0.47f, 0.15f, -0.73f)
                verticalLineTo(7f)
                curveToRelative(0f, -1.11f, -0.89f, -2f, -2f, -2f)
                horizontalLineToRelative(-7.58f)
                lineToRelative(3.29f, -3.3f)
                lineTo(16f, 1f)
                lineToRelative(-4f, 4f)
                lineToRelative(-4f, -4f)
                lineToRelative(-0.7f, 0.7f)
                lineTo(10.58f, 5f)
                horizontalLineTo(8.12f)
                lineToRelative(2f, 2f)
                horizontalLineTo(21f)
                close()
                moveToRelative(-0.54f, 16f)
                lineToRelative(1.26f, -1.27f)
                lineToRelative(-1.26f, 1.26f)
                close()
                moveTo(2.41f, 2.13f)
                lineToRelative(-0.14f, 0.14f)
                lineTo(1f, 3.54f)
                lineToRelative(1.53f, 1.53f)
                curveTo(1.65f, 5.28f, 1f, 6.06f, 1f, 7f)
                verticalLineToRelative(12f)
                curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                horizontalLineToRelative(15.46f)
                lineToRelative(1.99f, 1.99f)
                lineToRelative(1.26f, -1.26f)
                lineToRelative(0.15f, -0.15f)
                lineTo(2.41f, 2.13f)
                close()
                moveTo(3f, 19f)
                verticalLineTo(7f)
                horizontalLineToRelative(1.46f)
                lineToRelative(12f, 12f)
                horizontalLineTo(3f)
                close()
            }
        }.build()
        
        return _Tv_off!!
    }

private var _Tv_off: ImageVector? = null

