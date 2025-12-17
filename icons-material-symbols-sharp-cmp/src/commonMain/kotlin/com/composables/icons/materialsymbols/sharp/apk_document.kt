package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Apk_document: ImageVector
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
                moveTo(160f, 880f)
                verticalLineToRelative(-800f)
                horizontalLineToRelative(400f)
                lineToRelative(240f, 240f)
                verticalLineToRelative(560f)
                horizontalLineTo(160f)
                close()
                moveToRelative(360f, -520f)
                verticalLineToRelative(-200f)
                horizontalLineTo(240f)
                verticalLineToRelative(640f)
                horizontalLineToRelative(480f)
                verticalLineToRelative(-440f)
                horizontalLineTo(520f)
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

