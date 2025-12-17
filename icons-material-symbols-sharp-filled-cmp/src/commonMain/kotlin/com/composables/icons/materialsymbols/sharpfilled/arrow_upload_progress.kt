package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Arrow_upload_progress: ImageVector
    get() {
        if (_Arrow_upload_progress != null) return _Arrow_upload_progress!!
        
        _Arrow_upload_progress = ImageVector.Builder(
            name = "arrow_upload_progress",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(441f, 878f)
                quadToRelative(-76f, -8f, -141.5f, -41.5f)
                reflectiveQuadToRelative(-114.5f, -87f)
                quadTo(136f, 696f, 108f, 627f)
                reflectiveQuadTo(80f, 480f)
                quadToRelative(0f, -157f, 104.5f, -270f)
                reflectiveQuadTo(441f, 82f)
                verticalLineToRelative(81f)
                quadToRelative(-119f, 15f, -200f, 104.5f)
                reflectiveQuadTo(160f, 480f)
                quadToRelative(0f, 123f, 81f, 212.5f)
                reflectiveQuadTo(441f, 797f)
                verticalLineToRelative(81f)
                close()
                moveToRelative(0f, -198f)
                verticalLineToRelative(-247f)
                lineTo(337f, 537f)
                lineToRelative(-56f, -57f)
                lineToRelative(200f, -200f)
                lineToRelative(200f, 200f)
                lineToRelative(-57f, 56f)
                lineToRelative(-103f, -103f)
                verticalLineToRelative(247f)
                horizontalLineToRelative(-80f)
                close()
                moveToRelative(80f, 198f)
                verticalLineToRelative(-81f)
                quadToRelative(44f, -5f, 83.5f, -22f)
                reflectiveQuadToRelative(72.5f, -43f)
                lineToRelative(57f, 58f)
                quadToRelative(-45f, 36f, -99f, 59f)
                reflectiveQuadTo(521f, 878f)
                close()
                moveToRelative(155f, -650f)
                quadToRelative(-33f, -26f, -72f, -43f)
                reflectiveQuadToRelative(-83f, -22f)
                verticalLineToRelative(-81f)
                quadToRelative(60f, 6f, 114f, 29f)
                reflectiveQuadToRelative(99f, 59f)
                lineToRelative(-58f, 58f)
                close()
                moveToRelative(114f, 505f)
                lineToRelative(-57f, -57f)
                quadToRelative(26f, -33f, 43f, -72.5f)
                reflectiveQuadToRelative(22f, -83.5f)
                horizontalLineToRelative(81f)
                quadToRelative(-6f, 60f, -29.5f, 114f)
                reflectiveQuadTo(790f, 733f)
                close()
                moveToRelative(8f, -293f)
                quadToRelative(-5f, -44f, -22f, -83.5f)
                reflectiveQuadTo(733f, 284f)
                lineToRelative(57f, -57f)
                quadToRelative(36f, 45f, 59.5f, 99f)
                reflectiveQuadTo(879f, 440f)
                horizontalLineToRelative(-81f)
                close()
            }
        }.build()
        
        return _Arrow_upload_progress!!
    }

private var _Arrow_upload_progress: ImageVector? = null

