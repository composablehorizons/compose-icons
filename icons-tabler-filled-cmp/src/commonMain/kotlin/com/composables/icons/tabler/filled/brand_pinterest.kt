package com.composables.icons.tabler.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Filled.BrandPinterest: ImageVector
    get() {
        if (_BrandPinterest != null) return _BrandPinterest!!
        
        _BrandPinterest = ImageVector.Builder(
            name = "brand-pinterest",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(17f, 3.34f)
                arcToRelative(10f, 10f, 0f, false, true, -8.512f, 18.023f)
                lineToRelative(2.364f, -5.315f)
                arcToRelative(3.5f, 3.5f, 0f, false, false, 2.398f, 0.952f)
                curveToRelative(2.708f, 0f, 4.75f, -2.089f, 4.75f, -5f)
                arcToRelative(6f, 6f, 0f, true, false, -11.64f, 2.041f)
                arcToRelative(1f, 1f, 0f, true, false, 1.88f, -0.682f)
                arcToRelative(4f, 4f, 0f, true, true, 7.76f, -1.36f)
                curveToRelative(0f, 1.818f, -1.156f, 3.001f, -2.75f, 3.001f)
                curveToRelative(-0.609f, 0f, -1.153f, -0.361f, -1.478f, -1.022f)
                lineToRelative(1.142f, -2.572f)
                arcToRelative(1f, 1f, 0f, false, false, -1.828f, -0.812f)
                lineToRelative(-4.392f, 9.882f)
                arcToRelative(10f, 10f, 0f, false, true, -4.694f, -8.476f)
                lineToRelative(0.005f, -0.324f)
                arcToRelative(10f, 10f, 0f, false, true, 14.995f, -8.336f)
            }
        }.build()
        
        return _BrandPinterest!!
    }

private var _BrandPinterest: ImageVector? = null

