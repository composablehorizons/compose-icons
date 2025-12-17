package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Zone_person_urgent: ImageVector
    get() {
        if (_Zone_person_urgent != null) return _Zone_person_urgent!!
        
        _Zone_person_urgent = ImageVector.Builder(
            name = "zone_person_urgent",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(80f, 240f)
                verticalLineToRelative(-200f)
                horizontalLineToRelative(200f)
                verticalLineToRelative(80f)
                horizontalLineTo(160f)
                verticalLineToRelative(120f)
                horizontalLineTo(80f)
                close()
                moveToRelative(200f, 600f)
                horizontalLineTo(80f)
                verticalLineToRelative(-200f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(120f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(80f)
                close()
                moveToRelative(520f, -600f)
                verticalLineToRelative(-120f)
                horizontalLineTo(680f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(200f)
                verticalLineToRelative(200f)
                horizontalLineToRelative(-80f)
                close()
                moveTo(540f, 340f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(460f, 260f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(540f, 180f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(620f, 260f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(540f, 340f)
                close()
                moveTo(352f, 680f)
                lineToRelative(40f, -204f)
                lineToRelative(-72f, 28f)
                verticalLineToRelative(136f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(-188f)
                lineToRelative(158f, -68f)
                quadToRelative(35f, -15f, 51.5f, -19.5f)
                reflectiveQuadTo(480f, 360f)
                quadToRelative(21f, 0f, 39f, 11f)
                reflectiveQuadToRelative(29f, 29f)
                lineToRelative(40f, 64f)
                quadToRelative(11f, 17f, 24f, 31.5f)
                reflectiveQuadToRelative(30f, 26.5f)
                lineToRelative(-41f, 71f)
                quadToRelative(-17f, -11f, -32.5f, -24.5f)
                reflectiveQuadTo(540f, 540f)
                lineToRelative(-28f, 140f)
                horizontalLineTo(352f)
                close()
                moveTo(531f, 880f)
                lineToRelative(229f, -401f)
                lineTo(989f, 880f)
                horizontalLineTo(531f)
                close()
                moveToRelative(229f, -40f)
                quadToRelative(8f, 0f, 14f, -6f)
                reflectiveQuadToRelative(6f, -14f)
                quadToRelative(0f, -8f, -6f, -14f)
                reflectiveQuadToRelative(-14f, -6f)
                quadToRelative(-8f, 0f, -14f, 6f)
                reflectiveQuadToRelative(-6f, 14f)
                quadToRelative(0f, 8f, 6f, 14f)
                reflectiveQuadToRelative(14f, 6f)
                close()
                moveToRelative(-20f, -80f)
                horizontalLineToRelative(40f)
                verticalLineToRelative(-160f)
                horizontalLineToRelative(-40f)
                verticalLineToRelative(160f)
                close()
            }
        }.build()
        
        return _Zone_person_urgent!!
    }

private var _Zone_person_urgent: ImageVector? = null

