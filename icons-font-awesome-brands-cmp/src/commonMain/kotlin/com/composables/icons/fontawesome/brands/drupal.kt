package com.composables.icons.fontawesome.brands

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Brands.Drupal: ImageVector
    get() {
        if (_Drupal != null) return _Drupal!!
        
        _Drupal = ImageVector.Builder(
            name = "drupal",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 448f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(319.5f, 114.7f)
                curveToRelative(-22.2f, -14f, -43.5f, -19.5f, -64.7f, -33.5f)
                curveToRelative(-13f, -8.8f, -31.3f, -30f, -46.5f, -48.3f)
                curveToRelative(-2.7f, 29.3f, -11.5f, 41.2f, -22f, 49.5f)
                curveToRelative(-21.3f, 17f, -34.8f, 22.2f, -53.5f, 32.3f)
                curveTo(117f, 123f, 32f, 181.5f, 32f, 290.5f)
                curveTo(32f, 399.7f, 123.8f, 480f, 225.8f, 480f)
                curveTo(327.5f, 480f, 416f, 406f, 416f, 294f)
                curveToRelative(0f, -112.3f, -83f, -171f, -96.5f, -179.3f)
                close()
                moveToRelative(2.5f, 325.6f)
                curveToRelative(-20.1f, 20.1f, -90.1f, 28.7f, -116.7f, 4.2f)
                curveToRelative(-4.8f, -4.8f, 0.3f, -12f, 6.5f, -12f)
                curveToRelative(0f, 0f, 17f, 13.3f, 51.5f, 13.3f)
                curveToRelative(27f, 0f, 46f, -7.7f, 54.5f, -14f)
                curveToRelative(6.1f, -4.6f, 8.4f, 4.3f, 4.2f, 8.5f)
                close()
                moveToRelative(-54.5f, -52.6f)
                curveToRelative(8.7f, -3.6f, 29f, -3.8f, 36.8f, 1.3f)
                curveToRelative(4.1f, 2.8f, 16.1f, 18.8f, 6.2f, 23.7f)
                curveToRelative(-8.4f, 4.2f, -1.2f, -15.7f, -26.5f, -15.7f)
                curveToRelative(-14.7f, 0f, -19.5f, 5.2f, -26.7f, 11f)
                curveToRelative(-7f, 6f, -9.8f, 8f, -12.2f, 4.7f)
                curveToRelative(-6f, -8.2f, 15.9f, -22.3f, 22.4f, -25f)
                close()
                moveTo(360f, 405f)
                curveToRelative(-15.2f, -1f, -45.5f, -48.8f, -65f, -49.5f)
                curveToRelative(-30.9f, -0.9f, -104.1f, 80.7f, -161.3f, 42f)
                curveToRelative(-38.8f, -26.6f, -14.6f, -104.8f, 51.8f, -105.2f)
                curveToRelative(49.5f, -0.5f, 83.8f, 49f, 108.5f, 48.5f)
                curveToRelative(21.3f, -0.3f, 61.8f, -41.8f, 81.8f, -41.8f)
                curveToRelative(48.7f, 0f, 23.3f, 109.3f, -15.8f, 106f)
                close()
            }
        }.build()
        
        return _Drupal!!
    }

private var _Drupal: ImageVector? = null

