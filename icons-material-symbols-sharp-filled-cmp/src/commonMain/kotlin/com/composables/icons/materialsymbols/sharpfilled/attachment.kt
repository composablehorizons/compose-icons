package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Attachment: ImageVector
    get() {
        if (_Attachment != null) return _Attachment!!
        
        _Attachment = ImageVector.Builder(
            name = "attachment",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(330f, 720f)
                quadToRelative(-104f, 0f, -177f, -73f)
                reflectiveQuadTo(80f, 470f)
                quadToRelative(0f, -104f, 73f, -177f)
                reflectiveQuadToRelative(177f, -73f)
                horizontalLineToRelative(370f)
                quadToRelative(75f, 0f, 127.5f, 52.5f)
                reflectiveQuadTo(880f, 400f)
                quadToRelative(0f, 75f, -52.5f, 127.5f)
                reflectiveQuadTo(700f, 580f)
                horizontalLineTo(350f)
                quadToRelative(-46f, 0f, -78f, -32f)
                reflectiveQuadToRelative(-32f, -78f)
                quadToRelative(0f, -46f, 32f, -78f)
                reflectiveQuadToRelative(78f, -32f)
                horizontalLineToRelative(370f)
                verticalLineToRelative(80f)
                horizontalLineTo(350f)
                quadToRelative(-13f, 0f, -21.5f, 8.5f)
                reflectiveQuadTo(320f, 470f)
                quadToRelative(0f, 13f, 8.5f, 21.5f)
                reflectiveQuadTo(350f, 500f)
                horizontalLineToRelative(350f)
                quadToRelative(42f, -1f, 71f, -29.5f)
                reflectiveQuadToRelative(29f, -70.5f)
                quadToRelative(0f, -42f, -29f, -71f)
                reflectiveQuadToRelative(-71f, -29f)
                horizontalLineTo(330f)
                quadToRelative(-71f, -1f, -120.5f, 49f)
                reflectiveQuadTo(160f, 470f)
                quadToRelative(0f, 70f, 49.5f, 119f)
                reflectiveQuadTo(330f, 640f)
                horizontalLineToRelative(390f)
                verticalLineToRelative(80f)
                horizontalLineTo(330f)
                close()
            }
        }.build()
        
        return _Attachment!!
    }

private var _Attachment: ImageVector? = null

