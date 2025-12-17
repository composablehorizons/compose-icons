package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Face_retouching_off: ImageVector
    get() {
        if (_Face_retouching_off != null) return _Face_retouching_off!!
        
        _Face_retouching_off = ImageVector.Builder(
            name = "face_retouching_off",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(814f, 884f)
                lineToRelative(-88f, -88f)
                quadToRelative(-51f, 39f, -113f, 61.5f)
                reflectiveQuadTo(482f, 880f)
                quadToRelative(-82f, 0f, -155f, -31.5f)
                reflectiveQuadToRelative(-127.5f, -86f)
                quadTo(145f, 708f, 113.5f, 635f)
                reflectiveQuadTo(82f, 480f)
                quadToRelative(0f, -69f, 22.5f, -131.5f)
                reflectiveQuadTo(166f, 235f)
                lineToRelative(-88f, -87f)
                lineToRelative(56f, -56f)
                lineToRelative(736f, 736f)
                lineToRelative(-56f, 56f)
                close()
                moveToRelative(17f, -209f)
                lineToRelative(-59f, -59f)
                quadToRelative(14f, -32f, 22f, -66f)
                reflectiveQuadToRelative(8f, -70f)
                quadToRelative(0f, -24f, -3f, -46.5f)
                reflectiveQuadTo(788f, 390f)
                quadToRelative(-21f, 5f, -42f, 7.5f)
                reflectiveQuadToRelative(-44f, 2.5f)
                quadToRelative(-56f, 0f, -106.5f, -14.5f)
                reflectiveQuadTo(500f, 344f)
                lineTo(286f, 130f)
                quadToRelative(44f, -24f, 93f, -37f)
                reflectiveQuadToRelative(103f, -13f)
                quadToRelative(83f, 0f, 155.5f, 31.5f)
                reflectiveQuadToRelative(127f, 85.5f)
                quadToRelative(54.5f, 54f, 86f, 127f)
                reflectiveQuadTo(882f, 480f)
                quadToRelative(0f, 53f, -12.5f, 101.5f)
                reflectiveQuadTo(831f, 675f)
                close()
                moveTo(362f, 570f)
                quadToRelative(-21f, 0f, -35.5f, -14.5f)
                reflectiveQuadTo(312f, 520f)
                quadToRelative(0f, -21f, 14.5f, -35.5f)
                reflectiveQuadTo(362f, 470f)
                quadToRelative(21f, 0f, 35.5f, 14.5f)
                reflectiveQuadTo(412f, 520f)
                quadToRelative(0f, 21f, -14.5f, 35.5f)
                reflectiveQuadTo(362f, 570f)
                close()
                moveToRelative(120f, 230f)
                quadToRelative(53f, 0f, 100f, -15.5f)
                reflectiveQuadToRelative(86f, -44.5f)
                lineTo(309f, 379f)
                quadToRelative(-30f, 32f, -67.5f, 56f)
                reflectiveQuadTo(162f, 474f)
                verticalLineToRelative(6f)
                quadToRelative(0f, 133f, 93.5f, 226.5f)
                reflectiveQuadTo(482f, 800f)
                close()
            }
        }.build()
        
        return _Face_retouching_off!!
    }

private var _Face_retouching_off: ImageVector? = null

