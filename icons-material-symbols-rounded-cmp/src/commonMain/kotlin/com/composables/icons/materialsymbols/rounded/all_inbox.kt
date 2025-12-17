package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.All_inbox: ImageVector
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
                quadToRelative(24f, 0f, 43.5f, -13f)
                reflectiveQuadToRelative(29.5f, -35f)
                quadToRelative(3f, -14f, 14f, -23f)
                reflectiveQuadToRelative(25f, -9f)
                horizontalLineToRelative(128f)
                verticalLineToRelative(-280f)
                horizontalLineTo(320f)
                verticalLineToRelative(280f)
                horizontalLineToRelative(128f)
                quadToRelative(14f, 0f, 25f, 8.5f)
                reflectiveQuadToRelative(14f, 22.5f)
                quadToRelative(5f, 24f, 26f, 36.5f)
                reflectiveQuadToRelative(47f, 12.5f)
                close()
                moveTo(320f, 720f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(240f, 640f)
                verticalLineToRelative(-480f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(320f, 80f)
                horizontalLineToRelative(480f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(880f, 160f)
                verticalLineToRelative(480f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(800f, 720f)
                horizontalLineTo(320f)
                close()
                moveTo(160f, 880f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(80f, 800f)
                verticalLineToRelative(-520f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(120f, 240f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(160f, 280f)
                verticalLineToRelative(520f)
                horizontalLineToRelative(520f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(720f, 840f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(680f, 880f)
                horizontalLineTo(160f)
                close()
                moveToRelative(160f, -240f)
                horizontalLineToRelative(480f)
                horizontalLineToRelative(-480f)
                close()
            }
        }.build()
        
        return _All_inbox!!
    }

private var _All_inbox: ImageVector? = null

