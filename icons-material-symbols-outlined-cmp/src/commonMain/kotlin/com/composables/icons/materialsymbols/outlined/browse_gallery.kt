package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Browse_gallery: ImageVector
    get() {
        if (_Browse_gallery != null) return _Browse_gallery!!
        
        _Browse_gallery = ImageVector.Builder(
            name = "browse_gallery",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(472f, 648f)
                lineToRelative(56f, -56f)
                lineToRelative(-128f, -128f)
                verticalLineToRelative(-184f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(216f)
                lineToRelative(152f, 152f)
                close()
                moveToRelative(248f, 172f)
                verticalLineToRelative(-88f)
                quadToRelative(74f, -35f, 117f, -103f)
                reflectiveQuadToRelative(43f, -149f)
                quadToRelative(0f, -81f, -43f, -149f)
                reflectiveQuadTo(720f, 228f)
                verticalLineToRelative(-88f)
                quadToRelative(109f, 38f, 174.5f, 131.5f)
                reflectiveQuadTo(960f, 480f)
                quadToRelative(0f, 115f, -65.5f, 208.5f)
                reflectiveQuadTo(720f, 820f)
                close()
                moveToRelative(-360f, 20f)
                quadToRelative(-75f, 0f, -140.5f, -28.5f)
                reflectiveQuadToRelative(-114f, -77f)
                quadToRelative(-48.5f, -48.5f, -77f, -114f)
                reflectiveQuadTo(0f, 480f)
                quadToRelative(0f, -75f, 28.5f, -140.5f)
                reflectiveQuadToRelative(77f, -114f)
                quadToRelative(48.5f, -48.5f, 114f, -77f)
                reflectiveQuadTo(360f, 120f)
                quadToRelative(75f, 0f, 140.5f, 28.5f)
                reflectiveQuadToRelative(114f, 77f)
                quadToRelative(48.5f, 48.5f, 77f, 114f)
                reflectiveQuadTo(720f, 480f)
                quadToRelative(0f, 75f, -28.5f, 140.5f)
                reflectiveQuadToRelative(-77f, 114f)
                quadToRelative(-48.5f, 48.5f, -114f, 77f)
                reflectiveQuadTo(360f, 840f)
                close()
                moveToRelative(0f, -80f)
                quadToRelative(117f, 0f, 198.5f, -81.5f)
                reflectiveQuadTo(640f, 480f)
                quadToRelative(0f, -117f, -81.5f, -198.5f)
                reflectiveQuadTo(360f, 200f)
                quadToRelative(-117f, 0f, -198.5f, 81.5f)
                reflectiveQuadTo(80f, 480f)
                quadToRelative(0f, 117f, 81.5f, 198.5f)
                reflectiveQuadTo(360f, 760f)
                close()
                moveToRelative(0f, -280f)
                close()
            }
        }.build()
        
        return _Browse_gallery!!
    }

private var _Browse_gallery: ImageVector? = null

