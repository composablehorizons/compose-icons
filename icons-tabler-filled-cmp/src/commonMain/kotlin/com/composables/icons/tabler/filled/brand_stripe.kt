package com.composables.icons.tabler.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Filled.BrandStripe: ImageVector
    get() {
        if (_BrandStripe != null) return _BrandStripe!!
        
        _BrandStripe = ImageVector.Builder(
            name = "brand-stripe",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(12.5f, 2f)
                curveToRelative(2.45f, 0f, 4.543f, 0.44f, 5.928f, 1.096f)
                arcToRelative(1f, 1f, 0f, false, true, 0.564f, 1.028f)
                lineToRelative(-0.5f, 4f)
                arcToRelative(1f, 1f, 0f, false, true, -1.429f, 0.776f)
                curveToRelative(-1.047f, -0.509f, -2.618f, -0.823f, -4.168f, -0.823f)
                quadToRelative(-0.206f, 0.001f, -0.332f, 0.026f)
                lineToRelative(0.028f, 0.024f)
                lineToRelative(0.07f, 0.047f)
                curveToRelative(0.314f, 0.207f, 0.832f, 0.437f, 1.672f, 0.746f)
                curveToRelative(3.824f, 1.351f, 5.667f, 3.24f, 5.667f, 6.58f)
                curveToRelative(0f, 2.13f, -0.758f, 3.732f, -2.295f, 4.924f)
                curveToRelative(-1.293f, 1.023f, -3.422f, 1.576f, -5.705f, 1.576f)
                curveToRelative(-2.4f, 0f, -4.72f, -0.644f, -6.486f, -1.626f)
                arcToRelative(1f, 1f, 0f, false, true, -0.506f, -0.998f)
                lineToRelative(0.5f, -4f)
                arcToRelative(1f, 1f, 0f, false, true, 1.494f, -0.741f)
                curveToRelative(1.292f, 0.75f, 3.64f, 1.365f, 4.998f, 1.365f)
                curveToRelative(0.39f, 0f, 0.704f, -0.147f, 0.87f, -0.295f)
                lineToRelative(0.035f, -0.035f)
                lineToRelative(-0.09f, -0.035f)
                curveToRelative(-0.167f, -0.06f, -1.583f, -0.493f, -2.153f, -0.694f)
                curveToRelative(-3.626f, -1.304f, -5.662f, -3.609f, -5.662f, -6.941f)
                curveToRelative(0f, -1.887f, 0.882f, -3.563f, 2.37f, -4.777f)
                curveToRelative(1.22f, -0.987f, 2.517f, -1.223f, 5.13f, -1.223f)
            }
        }.build()
        
        return _BrandStripe!!
    }

private var _BrandStripe: ImageVector? = null

