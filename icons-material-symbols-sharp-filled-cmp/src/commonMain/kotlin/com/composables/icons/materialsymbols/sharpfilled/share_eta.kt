package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Share_eta: ImageVector
    get() {
        if (_Share_eta != null) return _Share_eta!!
        
        _Share_eta = ImageVector.Builder(
            name = "share_eta",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(401f, 960f)
                quadToRelative(-83f, 0f, -156f, -31.5f)
                reflectiveQuadToRelative(-127.5f, -86f)
                quadTo(63f, 788f, 31.5f, 715f)
                reflectiveQuadTo(0f, 560f)
                quadToRelative(0f, -83f, 31.5f, -156f)
                reflectiveQuadToRelative(86f, -127.5f)
                quadTo(172f, 222f, 245f, 190.5f)
                reflectiveQuadTo(401f, 159f)
                quadToRelative(10f, 0f, 19.5f, 0.5f)
                reflectiveQuadTo(440f, 161f)
                verticalLineToRelative(80f)
                quadToRelative(-10f, -1f, -19.5f, -1.5f)
                reflectiveQuadTo(401f, 239f)
                quadToRelative(-134f, 0f, -227.5f, 93.5f)
                reflectiveQuadTo(80f, 560f)
                quadToRelative(0f, 133f, 93.5f, 226.5f)
                reflectiveQuadTo(401f, 880f)
                quadToRelative(133f, 0f, 226.5f, -93.5f)
                reflectiveQuadTo(721f, 560f)
                horizontalLineToRelative(80f)
                quadToRelative(0f, 82f, -31.5f, 155f)
                reflectiveQuadToRelative(-86f, 127.5f)
                quadToRelative(-54.5f, 54.5f, -127f, 86f)
                reflectiveQuadTo(401f, 960f)
                close()
                moveToRelative(131f, -212f)
                lineTo(360f, 576f)
                verticalLineToRelative(-216f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(184f)
                lineToRelative(148f, 148f)
                lineToRelative(-56f, 56f)
                close()
                moveToRelative(342f, -268f)
                quadToRelative(-23f, -142f, -120f, -246.5f)
                reflectiveQuadTo(520f, 94f)
                verticalLineToRelative(-82f)
                quadToRelative(171f, 37f, 290.5f, 165f)
                reflectiveQuadTo(955f, 480f)
                horizontalLineToRelative(-81f)
                close()
                moveToRelative(-163f, 0f)
                quadToRelative(-19f, -75f, -69.5f, -132f)
                reflectiveQuadTo(520f, 262f)
                verticalLineToRelative(-85f)
                quadToRelative(103f, 32f, 177f, 113.5f)
                reflectiveQuadTo(793f, 480f)
                horizontalLineToRelative(-82f)
                close()
            }
        }.build()
        
        return _Share_eta!!
    }

private var _Share_eta: ImageVector? = null

