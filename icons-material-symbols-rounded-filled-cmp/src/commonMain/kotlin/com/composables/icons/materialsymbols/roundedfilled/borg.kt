package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Borg: ImageVector
    get() {
        if (_Borg != null) return _Borg!!
        
        _Borg = ImageVector.Builder(
            name = "borg",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(440f, 869f)
                lineTo(160f, 708f)
                quadToRelative(-19f, -11f, -29.5f, -29.5f)
                reflectiveQuadTo(120f, 638f)
                verticalLineToRelative(-118f)
                horizontalLineToRelative(200f)
                verticalLineToRelative(80f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(360f, 640f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(229f)
                close()
                moveTo(120f, 440f)
                verticalLineToRelative(-118f)
                quadToRelative(0f, -22f, 10.5f, -40.5f)
                reflectiveQuadTo(160f, 252f)
                lineToRelative(280f, -161f)
                verticalLineToRelative(229f)
                horizontalLineToRelative(-80f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(320f, 360f)
                verticalLineToRelative(80f)
                horizontalLineTo(120f)
                close()
                moveToRelative(280f, 120f)
                verticalLineToRelative(-160f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(160f)
                horizontalLineTo(400f)
                close()
                moveTo(520f, 869f)
                verticalLineToRelative(-229f)
                horizontalLineToRelative(80f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(640f, 600f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(200f)
                verticalLineToRelative(118f)
                quadToRelative(0f, 22f, -10.5f, 40.5f)
                reflectiveQuadTo(800f, 708f)
                lineTo(520f, 869f)
                close()
                moveToRelative(120f, -429f)
                verticalLineToRelative(-80f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(600f, 320f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(-229f)
                lineToRelative(280f, 161f)
                quadToRelative(19f, 11f, 29.5f, 29.5f)
                reflectiveQuadTo(840f, 322f)
                verticalLineToRelative(118f)
                horizontalLineTo(640f)
                close()
            }
        }.build()
        
        return _Borg!!
    }

private var _Borg: ImageVector? = null

