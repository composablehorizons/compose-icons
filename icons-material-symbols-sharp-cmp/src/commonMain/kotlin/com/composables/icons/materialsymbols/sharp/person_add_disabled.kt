package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Person_add_disabled: ImageVector
    get() {
        if (_Person_add_disabled != null) return _Person_add_disabled!!
        
        _Person_add_disabled = ImageVector.Builder(
            name = "person_add_disabled",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(792f, 904f)
                lineTo(680f, 792f)
                verticalLineToRelative(8f)
                horizontalLineTo(40f)
                verticalLineToRelative(-112f)
                quadToRelative(0f, -34f, 17.5f, -62.5f)
                reflectiveQuadTo(104f, 582f)
                quadToRelative(62f, -31f, 126f, -46.5f)
                reflectiveQuadTo(360f, 520f)
                quadToRelative(13f, 0f, 25.5f, 0.5f)
                reflectiveQuadTo(410f, 522f)
                lineToRelative(-42f, -42f)
                horizontalLineToRelative(-8f)
                quadToRelative(-66f, 0f, -113f, -47f)
                reflectiveQuadToRelative(-47f, -113f)
                verticalLineToRelative(-8f)
                lineTo(56f, 168f)
                lineToRelative(57f, -57f)
                lineToRelative(736f, 736f)
                lineToRelative(-57f, 57f)
                close()
                moveToRelative(-72f, -344f)
                verticalLineToRelative(-120f)
                horizontalLineTo(600f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(-120f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(120f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(80f)
                horizontalLineTo(800f)
                verticalLineToRelative(120f)
                horizontalLineToRelative(-80f)
                close()
                moveTo(504f, 388f)
                lineToRelative(-64f, -64f)
                verticalLineToRelative(-4f)
                quadToRelative(0f, -33f, -23.5f, -56.5f)
                reflectiveQuadTo(360f, 240f)
                horizontalLineToRelative(-4f)
                lineToRelative(-64f, -64f)
                quadToRelative(15f, -8f, 32.5f, -12f)
                reflectiveQuadToRelative(35.5f, -4f)
                quadToRelative(66f, 0f, 113f, 47f)
                reflectiveQuadToRelative(47f, 113f)
                quadToRelative(0f, 18f, -4f, 35.5f)
                reflectiveQuadTo(504f, 388f)
                close()
                moveTo(120f, 720f)
                horizontalLineToRelative(480f)
                lineToRelative(-86f, -94f)
                quadToRelative(-38f, -13f, -77f, -19.5f)
                reflectiveQuadToRelative(-77f, -6.5f)
                quadToRelative(-56f, 0f, -111f, 13.5f)
                reflectiveQuadTo(140f, 654f)
                quadToRelative(-9f, 5f, -14.5f, 14f)
                reflectiveQuadToRelative(-5.5f, 20f)
                verticalLineToRelative(32f)
                close()
                moveToRelative(320f, -396f)
                close()
                moveToRelative(-80f, 396f)
                close()
            }
        }.build()
        
        return _Person_add_disabled!!
    }

private var _Person_add_disabled: ImageVector? = null

