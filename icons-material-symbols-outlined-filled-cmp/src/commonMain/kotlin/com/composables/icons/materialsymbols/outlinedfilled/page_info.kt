package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Page_info: ImageVector
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
                moveTo(160f, 700f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(320f)
                verticalLineToRelative(80f)
                horizontalLineTo(160f)
                close()
                moveToRelative(90f, -250f)
                quadToRelative(-63f, 0f, -106.5f, -43.5f)
                reflectiveQuadTo(100f, 300f)
                quadToRelative(0f, -63f, 43.5f, -106.5f)
                reflectiveQuadTo(250f, 150f)
                quadToRelative(63f, 0f, 106.5f, 43.5f)
                reflectiveQuadTo(400f, 300f)
                quadToRelative(0f, 63f, -43.5f, 106.5f)
                reflectiveQuadTo(250f, 450f)
                close()
                moveToRelative(230f, -110f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(320f)
                verticalLineToRelative(80f)
                horizontalLineTo(480f)
                close()
            }
        }.build()
        
        return _Page_info!!
    }

private var _Page_info: ImageVector? = null

