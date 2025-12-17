package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Dry_cleaning: ImageVector
    get() {
        if (_Dry_cleaning != null) return _Dry_cleaning!!
        
        _Dry_cleaning = ImageVector.Builder(
            name = "dry_cleaning",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(280f, 880f)
                verticalLineToRelative(-240f)
                horizontalLineTo(120f)
                verticalLineToRelative(-160f)
                lineToRelative(320f, -142f)
                verticalLineToRelative(-26f)
                quadToRelative(-36f, -13f, -58f, -43.5f)
                reflectiveQuadTo(360f, 200f)
                quadToRelative(0f, -50f, 35f, -85f)
                reflectiveQuadToRelative(85f, -35f)
                quadToRelative(50f, 0f, 85f, 35f)
                reflectiveQuadToRelative(35f, 85f)
                horizontalLineToRelative(-80f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(480f, 160f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(440f, 200f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(480f, 240f)
                horizontalLineToRelative(40f)
                verticalLineToRelative(98f)
                lineToRelative(320f, 142f)
                verticalLineToRelative(160f)
                horizontalLineTo(680f)
                verticalLineToRelative(240f)
                horizontalLineTo(280f)
                close()
                moveToRelative(-80f, -320f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-40f)
                horizontalLineToRelative(400f)
                verticalLineToRelative(40f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-28f)
                lineTo(480f, 408f)
                lineTo(200f, 532f)
                verticalLineToRelative(28f)
                close()
            }
        }.build()
        
        return _Dry_cleaning!!
    }

private var _Dry_cleaning: ImageVector? = null

