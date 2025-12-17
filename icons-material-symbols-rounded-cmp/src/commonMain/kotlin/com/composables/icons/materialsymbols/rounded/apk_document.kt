package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Apk_document: ImageVector
    get() {
        if (_Apk_document != null) return _Apk_document!!
        
        _Apk_document = ImageVector.Builder(
            name = "apk_document",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(280f, 760f)
                horizontalLineToRelative(400f)
                quadToRelative(-4f, -49f, -30f, -90f)
                reflectiveQuadToRelative(-68f, -65f)
                lineToRelative(38f, -68f)
                quadToRelative(2f, -4f, 1f, -9f)
                reflectiveQuadToRelative(-6f, -7f)
                quadToRelative(-4f, -2f, -8.5f, -1f)
                reflectiveQuadToRelative(-6.5f, 5f)
                lineToRelative(-39f, 70f)
                quadToRelative(-20f, -8f, -40f, -12.5f)
                reflectiveQuadToRelative(-41f, -4.5f)
                quadToRelative(-21f, 0f, -41f, 4.5f)
                reflectiveQuadTo(399f, 595f)
                lineToRelative(-39f, -70f)
                quadToRelative(-2f, -5f, -6.5f, -5f)
                reflectiveQuadToRelative(-9.5f, 2f)
                lineToRelative(-4f, 15f)
                lineToRelative(38f, 68f)
                quadToRelative(-42f, 24f, -68f, 65f)
                reflectiveQuadToRelative(-30f, 90f)
                close()
                moveToRelative(110f, -60f)
                quadToRelative(-8f, 0f, -14f, -6f)
                reflectiveQuadToRelative(-6f, -14f)
                quadToRelative(0f, -8f, 6f, -14f)
                reflectiveQuadToRelative(14f, -6f)
                quadToRelative(8f, 0f, 14f, 6f)
                reflectiveQuadToRelative(6f, 14f)
                quadToRelative(0f, 8f, -6f, 14f)
                reflectiveQuadToRelative(-14f, 6f)
                close()
                moveToRelative(180f, 0f)
                quadToRelative(-8f, 0f, -14f, -6f)
                reflectiveQuadToRelative(-6f, -14f)
                quadToRelative(0f, -8f, 6f, -14f)
                reflectiveQuadToRelative(14f, -6f)
                quadToRelative(8f, 0f, 14f, 6f)
                reflectiveQuadToRelative(6f, 14f)
                quadToRelative(0f, 8f, -6f, 14f)
                reflectiveQuadToRelative(-14f, 6f)
                close()
                moveTo(240f, 880f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(160f, 800f)
                verticalLineToRelative(-640f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(240f, 80f)
                horizontalLineToRelative(287f)
                quadToRelative(16f, 0f, 30.5f, 6f)
                reflectiveQuadToRelative(25.5f, 17f)
                lineToRelative(194f, 194f)
                quadToRelative(11f, 11f, 17f, 25.5f)
                reflectiveQuadToRelative(6f, 30.5f)
                verticalLineToRelative(447f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(720f, 880f)
                horizontalLineTo(240f)
                close()
                moveToRelative(280f, -560f)
                verticalLineToRelative(-160f)
                horizontalLineTo(240f)
                verticalLineToRelative(640f)
                horizontalLineToRelative(480f)
                verticalLineToRelative(-440f)
                horizontalLineTo(560f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(520f, 320f)
                close()
                moveTo(240f, 160f)
                verticalLineToRelative(200f)
                verticalLineToRelative(-200f)
                verticalLineToRelative(640f)
                verticalLineToRelative(-640f)
                close()
            }
        }.build()
        
        return _Apk_document!!
    }

private var _Apk_document: ImageVector? = null

