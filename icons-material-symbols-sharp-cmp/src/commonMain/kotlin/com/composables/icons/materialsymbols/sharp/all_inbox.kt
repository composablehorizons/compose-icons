package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.All_inbox: ImageVector
    get() {
        if (_All_inbox != null) return _All_inbox!!
        
        _All_inbox = ImageVector.Builder(
            name = "all_inbox",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(320f, 640f)
                horizontalLineToRelative(480f)
                verticalLineToRelative(-120f)
                horizontalLineTo(698f)
                quadToRelative(-21f, 37f, -58f, 58.5f)
                reflectiveQuadTo(560f, 600f)
                quadToRelative(-42f, 0f, -79f, -21.5f)
                reflectiveQuadTo(422f, 520f)
                horizontalLineTo(320f)
                verticalLineToRelative(120f)
                close()
                moveToRelative(240f, -120f)
                quadToRelative(34f, 0f, 57f, -23.5f)
                reflectiveQuadToRelative(23f, -56.5f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(-280f)
                horizontalLineTo(320f)
                verticalLineToRelative(280f)
                horizontalLineToRelative(160f)
                quadToRelative(0f, 33f, 23.5f, 56.5f)
                reflectiveQuadTo(560f, 520f)
                close()
                moveTo(240f, 720f)
                verticalLineToRelative(-640f)
                horizontalLineToRelative(640f)
                verticalLineToRelative(640f)
                horizontalLineTo(240f)
                close()
                moveTo(80f, 880f)
                verticalLineToRelative(-640f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(560f)
                horizontalLineToRelative(560f)
                verticalLineToRelative(80f)
                horizontalLineTo(80f)
                close()
                moveToRelative(240f, -240f)
                horizontalLineToRelative(480f)
                horizontalLineToRelative(-480f)
                close()
            }
        }.build()
        
        return _All_inbox!!
    }

private var _All_inbox: ImageVector? = null

