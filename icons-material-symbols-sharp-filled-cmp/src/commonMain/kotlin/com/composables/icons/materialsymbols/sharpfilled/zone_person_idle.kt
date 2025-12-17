package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Zone_person_idle: ImageVector
    get() {
        if (_Zone_person_idle != null) return _Zone_person_idle!!
        
        _Zone_person_idle = ImageVector.Builder(
            name = "zone_person_idle",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(819f, 882f)
                lineTo(528f, 590f)
                lineToRelative(-16f, 78f)
                horizontalLineTo(352f)
                lineToRelative(40f, -204f)
                lineToRelative(-72f, 28f)
                verticalLineToRelative(136f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(-188f)
                lineToRelative(96f, -41f)
                lineTo(27f, 90f)
                lineToRelative(57f, -57f)
                lineToRelative(792f, 792f)
                lineToRelative(-57f, 57f)
                close()
                moveTo(80f, 828f)
                verticalLineToRelative(-200f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(120f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(80f)
                horizontalLineTo(80f)
                close()
                moveToRelative(720f, -600f)
                verticalLineToRelative(-120f)
                horizontalLineTo(680f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(200f)
                verticalLineToRelative(200f)
                horizontalLineToRelative(-80f)
                close()
                moveToRelative(-720f, 0f)
                verticalLineToRelative(-120f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(120f)
                horizontalLineTo(80f)
                close()
                moveToRelative(600f, 600f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(80f)
                horizontalLineTo(680f)
                close()
                moveTo(273f, 108f)
                lineToRelative(-80f, -80f)
                horizontalLineToRelative(87f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(-7f)
                close()
                moveToRelative(607f, 607f)
                lineToRelative(-80f, -80f)
                verticalLineToRelative(-7f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(87f)
                close()
                moveTo(540f, 328f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(460f, 248f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(540f, 168f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(620f, 248f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(540f, 328f)
                close()
            }
        }.build()
        
        return _Zone_person_idle!!
    }

private var _Zone_person_idle: ImageVector? = null

