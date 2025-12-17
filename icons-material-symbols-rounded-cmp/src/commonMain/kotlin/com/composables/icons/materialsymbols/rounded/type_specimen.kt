package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Type_specimen: ImageVector
    get() {
        if (_Type_specimen != null) return _Type_specimen!!
        
        _Type_specimen = ImageVector.Builder(
            name = "type_specimen",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(488f, 488f)
                horizontalLineToRelative(146f)
                lineToRelative(25f, 73f)
                quadToRelative(3f, 8f, 10.5f, 13.5f)
                reflectiveQuadTo(686f, 580f)
                quadToRelative(15f, 0f, 23.5f, -12.5f)
                reflectiveQuadTo(713f, 541f)
                lineTo(599f, 239f)
                quadToRelative(-3f, -9f, -11f, -14f)
                reflectiveQuadToRelative(-17f, -5f)
                horizontalLineToRelative(-22f)
                quadToRelative(-9f, 0f, -17f, 5f)
                reflectiveQuadToRelative(-11f, 14f)
                lineTo(407f, 540f)
                quadToRelative(-5f, 14f, 3.5f, 27f)
                reflectiveQuadToRelative(24.5f, 13f)
                quadToRelative(10f, 0f, 17.5f, -5.5f)
                reflectiveQuadTo(463f, 560f)
                lineToRelative(25f, -72f)
                close()
                moveToRelative(18f, -52f)
                lineToRelative(52f, -150f)
                horizontalLineToRelative(4f)
                lineToRelative(52f, 150f)
                horizontalLineTo(506f)
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
                moveToRelative(0f, -80f)
                horizontalLineToRelative(480f)
                verticalLineToRelative(-480f)
                horizontalLineTo(320f)
                verticalLineToRelative(480f)
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
                moveToRelative(160f, -720f)
                verticalLineToRelative(480f)
                verticalLineToRelative(-480f)
                close()
            }
        }.build()
        
        return _Type_specimen!!
    }

private var _Type_specimen: ImageVector? = null

