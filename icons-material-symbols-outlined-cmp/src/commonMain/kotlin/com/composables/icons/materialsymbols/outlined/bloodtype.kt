package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Bloodtype: ImageVector
    get() {
        if (_Bloodtype != null) return _Bloodtype!!
        
        _Bloodtype = ImageVector.Builder(
            name = "bloodtype",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(480f, 880f)
                quadToRelative(-137f, 0f, -228.5f, -94f)
                reflectiveQuadTo(160f, 552f)
                quadToRelative(0f, -100f, 79.5f, -217.5f)
                reflectiveQuadTo(480f, 80f)
                quadToRelative(161f, 137f, 240.5f, 254.5f)
                reflectiveQuadTo(800f, 552f)
                quadToRelative(0f, 140f, -91.5f, 234f)
                reflectiveQuadTo(480f, 880f)
                close()
                moveToRelative(0f, -80f)
                quadToRelative(104f, 0f, 172f, -70.5f)
                reflectiveQuadTo(720f, 552f)
                quadToRelative(0f, -73f, -60.5f, -165f)
                reflectiveQuadTo(480f, 186f)
                quadTo(361f, 295f, 300.5f, 387f)
                reflectiveQuadTo(240f, 552f)
                quadToRelative(0f, 107f, 68f, 177.5f)
                reflectiveQuadTo(480f, 800f)
                close()
                moveToRelative(-120f, -80f)
                horizontalLineToRelative(240f)
                verticalLineToRelative(-80f)
                horizontalLineTo(360f)
                verticalLineToRelative(80f)
                close()
                moveToRelative(80f, -120f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(80f)
                close()
                moveToRelative(40f, -120f)
                close()
            }
        }.build()
        
        return _Bloodtype!!
    }

private var _Bloodtype: ImageVector? = null

