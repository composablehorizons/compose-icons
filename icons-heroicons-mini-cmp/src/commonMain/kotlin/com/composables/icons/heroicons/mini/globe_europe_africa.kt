package com.composables.icons.heroicons.mini

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Mini.GlobeEuropeAfrica: ImageVector
    get() {
        if (_GlobeEuropeAfrica != null) return _GlobeEuropeAfrica!!
        
        _GlobeEuropeAfrica = ImageVector.Builder(
            name = "globe-europe-africa",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 20f,
            viewportHeight = 20f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(18f, 10f)
                arcToRelative(8f, 8f, 0f, true, true, -16f, 0f)
                arcToRelative(8f, 8f, 0f, false, true, 16f, 0f)
                close()
                moveToRelative(-1.503f, 0.204f)
                arcTo(6.5f, 6.5f, 0f, true, true, 7.95f, 3.83f)
                lineTo(6.927f, 5.62f)
                arcToRelative(1.453f, 1.453f, 0f, false, false, 1.91f, 2.02f)
                lineToRelative(0.175f, -0.087f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.224f, -0.053f)
                horizontalLineToRelative(0.146f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.447f, 0.724f)
                lineToRelative(-0.028f, 0.055f)
                arcToRelative(0.4f, 0.4f, 0f, false, true, -0.357f, 0.221f)
                horizontalLineToRelative(-0.502f)
                arcToRelative(2.26f, 2.26f, 0f, false, false, -1.88f, 1.006f)
                lineToRelative(-0.044f, 0.066f)
                arcToRelative(2.099f, 2.099f, 0f, false, false, 1.085f, 3.156f)
                arcToRelative(0.58f, 0.58f, 0f, false, true, 0.397f, 0.547f)
                verticalLineToRelative(1.05f)
                arcToRelative(1.175f, 1.175f, 0f, false, false, 2.093f, 0.734f)
                lineToRelative(1.611f, -2.014f)
                curveToRelative(0.192f, -0.24f, 0.296f, -0.536f, 0.296f, -0.842f)
                curveToRelative(0f, -0.316f, 0.128f, -0.624f, 0.353f, -0.85f)
                arcToRelative(1.363f, 1.363f, 0f, false, false, 0.173f, -1.716f)
                lineToRelative(-0.464f, -0.696f)
                arcToRelative(0.369f, 0.369f, 0f, false, true, 0.527f, -0.499f)
                lineToRelative(0.343f, 0.257f)
                curveToRelative(0.316f, 0.237f, 0.738f, 0.275f, 1.091f, 0.098f)
                arcToRelative(0.586f, 0.586f, 0f, false, true, 0.677f, 0.11f)
                lineToRelative(1.297f, 1.297f)
                close()
            }
        }.build()
        
        return _GlobeEuropeAfrica!!
    }

private var _GlobeEuropeAfrica: ImageVector? = null

