package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Inbox_text: ImageVector
    get() {
        if (_Inbox_text != null) return _Inbox_text!!
        
        _Inbox_text = ImageVector.Builder(
            name = "inbox_text",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(320f, 490f)
                horizontalLineToRelative(320f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(680f, 450f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(640f, 410f)
                horizontalLineTo(320f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(280f, 450f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(320f, 490f)
                close()
                moveToRelative(0f, -140f)
                horizontalLineToRelative(320f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(680f, 310f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(640f, 270f)
                horizontalLineTo(320f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(280f, 310f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(320f, 350f)
                close()
                moveTo(200f, 840f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(120f, 760f)
                verticalLineToRelative(-560f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(200f, 120f)
                horizontalLineToRelative(560f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(840f, 200f)
                verticalLineToRelative(560f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(760f, 840f)
                horizontalLineTo(200f)
                close()
                moveToRelative(0f, -80f)
                horizontalLineToRelative(560f)
                verticalLineToRelative(-120f)
                horizontalLineTo(640f)
                quadToRelative(-30f, 38f, -71.5f, 59f)
                reflectiveQuadTo(480f, 720f)
                quadToRelative(-47f, 0f, -88.5f, -21f)
                reflectiveQuadTo(320f, 640f)
                horizontalLineTo(200f)
                verticalLineToRelative(120f)
                close()
                moveToRelative(280f, -120f)
                quadToRelative(32f, 0f, 59f, -16.5f)
                reflectiveQuadToRelative(44f, -43.5f)
                quadToRelative(6f, -9f, 15f, -14.5f)
                reflectiveQuadToRelative(20f, -5.5f)
                horizontalLineToRelative(142f)
                verticalLineToRelative(-360f)
                horizontalLineTo(200f)
                verticalLineToRelative(360f)
                horizontalLineToRelative(142f)
                quadToRelative(11f, 0f, 20f, 5.5f)
                reflectiveQuadToRelative(15f, 14.5f)
                quadToRelative(17f, 27f, 44f, 43.5f)
                reflectiveQuadToRelative(59f, 16.5f)
                close()
                moveTo(200f, 760f)
                horizontalLineToRelative(560f)
                horizontalLineToRelative(-560f)
                close()
            }
        }.build()
        
        return _Inbox_text!!
    }

private var _Inbox_text: ImageVector? = null

