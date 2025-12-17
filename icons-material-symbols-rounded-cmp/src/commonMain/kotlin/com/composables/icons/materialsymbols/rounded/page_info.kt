package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Page_info: ImageVector
    get() {
        if (_Page_info != null) return _Page_info!!
        
        _Page_info = ImageVector.Builder(
            name = "page_info",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(710f, 810f)
                quadToRelative(-63f, 0f, -106.5f, -43.5f)
                reflectiveQuadTo(560f, 660f)
                quadToRelative(0f, -63f, 43.5f, -106.5f)
                reflectiveQuadTo(710f, 510f)
                quadToRelative(63f, 0f, 106.5f, 43.5f)
                reflectiveQuadTo(860f, 660f)
                quadToRelative(0f, 63f, -43.5f, 106.5f)
                reflectiveQuadTo(710f, 810f)
                close()
                moveToRelative(0f, -80f)
                quadToRelative(29f, 0f, 49.5f, -20.5f)
                reflectiveQuadTo(780f, 660f)
                quadToRelative(0f, -29f, -20.5f, -49.5f)
                reflectiveQuadTo(710f, 590f)
                quadToRelative(-29f, 0f, -49.5f, 20.5f)
                reflectiveQuadTo(640f, 660f)
                quadToRelative(0f, 29f, 20.5f, 49.5f)
                reflectiveQuadTo(710f, 730f)
                close()
                moveToRelative(-270f, -30f)
                horizontalLineTo(200f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(160f, 660f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(200f, 620f)
                horizontalLineToRelative(240f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(480f, 660f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(440f, 700f)
                close()
                moveTo(250f, 450f)
                quadToRelative(-63f, 0f, -106.5f, -43.5f)
                reflectiveQuadTo(100f, 300f)
                quadToRelative(0f, -63f, 43.5f, -106.5f)
                reflectiveQuadTo(250f, 150f)
                quadToRelative(63f, 0f, 106.5f, 43.5f)
                reflectiveQuadTo(400f, 300f)
                quadToRelative(0f, 63f, -43.5f, 106.5f)
                reflectiveQuadTo(250f, 450f)
                close()
                moveToRelative(0f, -80f)
                quadToRelative(29f, 0f, 49.5f, -20.5f)
                reflectiveQuadTo(320f, 300f)
                quadToRelative(0f, -29f, -20.5f, -49.5f)
                reflectiveQuadTo(250f, 230f)
                quadToRelative(-29f, 0f, -49.5f, 20.5f)
                reflectiveQuadTo(180f, 300f)
                quadToRelative(0f, 29f, 20.5f, 49.5f)
                reflectiveQuadTo(250f, 370f)
                close()
                moveToRelative(510f, -30f)
                horizontalLineTo(520f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(480f, 300f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(520f, 260f)
                horizontalLineToRelative(240f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(800f, 300f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(760f, 340f)
                close()
                moveToRelative(-50f, 320f)
                close()
                moveTo(250f, 300f)
                close()
            }
        }.build()
        
        return _Page_info!!
    }

private var _Page_info: ImageVector? = null

