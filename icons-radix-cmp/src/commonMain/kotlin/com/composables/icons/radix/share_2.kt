package com.composables.icons.radix

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Radix.Share2: ImageVector
    get() {
        if (_Share2 != null) return _Share2!!
        
        _Share2 = ImageVector.Builder(
            name = "share-2",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 15f,
            viewportHeight = 15f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(2f, 5.50006f)
                curveTo(2f, 4.67163f, 2.67157f, 4.00006f, 3.5f, 4.00006f)
                lineTo(4.75f, 4.00006f)
                curveTo(5.02614f, 4.00006f, 5.25f, 4.22392f, 5.25f, 4.50006f)
                curveTo(5.25f, 4.7762f, 5.02614f, 5.00006f, 4.75f, 5.00006f)
                lineTo(3.5f, 5.00006f)
                curveTo(3.22386f, 5.00006f, 3f, 5.22392f, 3f, 5.50006f)
                lineTo(3f, 11.5001f)
                curveTo(3f, 11.7762f, 3.22386f, 12.0001f, 3.5f, 12.0001f)
                lineTo(11.5f, 12.0001f)
                curveTo(11.7761f, 12.0001f, 12f, 11.7762f, 12f, 11.5001f)
                lineTo(12f, 5.50006f)
                curveTo(12f, 5.22392f, 11.7761f, 5.00006f, 11.5f, 5.00006f)
                lineTo(10.25f, 5.00006f)
                curveTo(9.97386f, 5.00006f, 9.75f, 4.7762f, 9.75f, 4.50006f)
                curveTo(9.75f, 4.22392f, 9.97386f, 4.00006f, 10.25f, 4.00006f)
                lineTo(11.5f, 4.00006f)
                curveTo(12.3284f, 4.00006f, 13f, 4.67163f, 13f, 5.50006f)
                lineTo(13f, 11.5001f)
                curveTo(13f, 12.3285f, 12.3284f, 13.0001f, 11.5f, 13.0001f)
                lineTo(3.5f, 13.0001f)
                curveTo(2.67157f, 13.0001f, 2f, 12.3285f, 2f, 11.5001f)
                lineTo(2f, 5.50006f)
                close()
                moveTo(4.93164f, 3.06842f)
                curveTo(4.77781f, 2.91459f, 4.75854f, 2.6767f, 4.87402f, 2.50201f)
                lineTo(4.93164f, 2.4317f)
                lineTo(7.18164f, 0.181701f)
                curveTo(7.26603f, 0.0973098f, 7.38065f, 0.0498655f, 7.5f, 0.0498655f)
                curveTo(7.61935f, 0.0498655f, 7.73397f, 0.0973098f, 7.81836f, 0.181701f)
                lineTo(10.0684f, 2.4317f)
                curveTo(10.2441f, 2.60744f, 10.2441f, 2.89269f, 10.0684f, 3.06842f)
                curveTo(9.89263f, 3.24412f, 9.60737f, 3.24412f, 9.43164f, 3.06842f)
                lineTo(8f, 1.63678f)
                lineTo(8f, 8.50006f)
                curveTo(7.99997f, 8.77618f, 7.77612f, 9.00006f, 7.5f, 9.00006f)
                curveTo(7.22388f, 9.00006f, 7.00003f, 8.77618f, 7f, 8.50006f)
                lineTo(7f, 1.63678f)
                lineTo(5.56836f, 3.06842f)
                lineTo(5.49805f, 3.12604f)
                curveTo(5.32337f, 3.24152f, 5.08548f, 3.22223f, 4.93164f, 3.06842f)
                close()
            }
        }.build()
        
        return _Share2!!
    }

private var _Share2: ImageVector? = null

