package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Solar_power: ImageVector
    get() {
        if (_Solar_power != null) return _Solar_power!!
        
        _Solar_power = ImageVector.Builder(
            name = "solar_power",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(80f, 880f)
                lineToRelative(80f, -400f)
                horizontalLineToRelative(640f)
                lineToRelative(80f, 400f)
                horizontalLineTo(80f)
                close()
                moveToRelative(40f, -720f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(80f)
                horizontalLineTo(120f)
                close()
                moveToRelative(58f, 640f)
                horizontalLineToRelative(262f)
                verticalLineToRelative(-80f)
                horizontalLineTo(194f)
                lineToRelative(-16f, 80f)
                close()
                moveToRelative(67f, -427f)
                lineToRelative(-57f, -56f)
                lineToRelative(85f, -85f)
                lineToRelative(57f, 56f)
                lineToRelative(-85f, 85f)
                close()
                moveToRelative(-35f, 267f)
                horizontalLineToRelative(230f)
                verticalLineToRelative(-80f)
                horizontalLineTo(226f)
                lineToRelative(-16f, 80f)
                close()
                moveToRelative(270f, -360f)
                quadToRelative(-83f, 0f, -141.5f, -58.5f)
                reflectiveQuadTo(280f, 80f)
                horizontalLineToRelative(80f)
                quadToRelative(0f, 50f, 35f, 85f)
                reflectiveQuadToRelative(85f, 35f)
                quadToRelative(50f, 0f, 85f, -35f)
                reflectiveQuadToRelative(35f, -85f)
                horizontalLineToRelative(80f)
                quadToRelative(0f, 83f, -58.5f, 141.5f)
                reflectiveQuadTo(480f, 280f)
                close()
                moveToRelative(0f, -200f)
                close()
                moveToRelative(-40f, 360f)
                verticalLineToRelative(-120f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(120f)
                horizontalLineToRelative(-80f)
                close()
                moveToRelative(80f, 360f)
                horizontalLineToRelative(262f)
                lineToRelative(-16f, -80f)
                horizontalLineTo(520f)
                verticalLineToRelative(80f)
                close()
                moveToRelative(0f, -160f)
                horizontalLineToRelative(230f)
                lineToRelative(-16f, -80f)
                horizontalLineTo(520f)
                verticalLineToRelative(80f)
                close()
                moveToRelative(195f, -267f)
                lineToRelative(-84f, -85f)
                lineToRelative(56f, -56f)
                lineToRelative(85f, 84f)
                lineToRelative(-57f, 57f)
                close()
                moveToRelative(5f, -213f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(80f)
                horizontalLineTo(720f)
                close()
            }
        }.build()
        
        return _Solar_power!!
    }

private var _Solar_power: ImageVector? = null

