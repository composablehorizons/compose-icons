package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Stethoscope_arrow: ImageVector
    get() {
        if (_Stethoscope_arrow != null) return _Stethoscope_arrow!!
        
        _Stethoscope_arrow = ImageVector.Builder(
            name = "stethoscope_arrow",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(720f, 840f)
                lineToRelative(-56f, -56f)
                lineToRelative(63f, -64f)
                horizontalLineTo(560f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(167f)
                lineToRelative(-63f, -64f)
                lineToRelative(56f, -56f)
                lineToRelative(160f, 160f)
                lineToRelative(-160f, 160f)
                close()
                moveTo(540f, 880f)
                quadToRelative(-108f, 0f, -184f, -76f)
                reflectiveQuadToRelative(-76f, -184f)
                verticalLineToRelative(-23f)
                quadToRelative(-86f, -14f, -143f, -80.5f)
                reflectiveQuadTo(80f, 360f)
                verticalLineToRelative(-240f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(-40f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(160f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(-40f)
                horizontalLineToRelative(-40f)
                verticalLineToRelative(160f)
                quadToRelative(0f, 66f, 47f, 113f)
                reflectiveQuadToRelative(113f, 47f)
                quadToRelative(66f, 0f, 113f, -47f)
                reflectiveQuadToRelative(47f, -113f)
                verticalLineToRelative(-160f)
                horizontalLineToRelative(-40f)
                verticalLineToRelative(40f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(-160f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(40f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(240f)
                quadToRelative(0f, 90f, -57f, 156.5f)
                reflectiveQuadTo(360f, 597f)
                verticalLineToRelative(23f)
                quadToRelative(0f, 75f, 52.5f, 127.5f)
                reflectiveQuadTo(540f, 800f)
                verticalLineToRelative(80f)
                close()
            }
        }.build()
        
        return _Stethoscope_arrow!!
    }

private var _Stethoscope_arrow: ImageVector? = null

