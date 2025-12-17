package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Elevator: ImageVector
    get() {
        if (_Elevator != null) return _Elevator!!
        
        _Elevator = ImageVector.Builder(
            name = "elevator",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(280f, 720f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(-160f)
                horizontalLineToRelative(40f)
                verticalLineToRelative(-180f)
                horizontalLineTo(240f)
                verticalLineToRelative(180f)
                horizontalLineToRelative(40f)
                verticalLineToRelative(160f)
                close()
                moveToRelative(60f, -380f)
                quadToRelative(21f, 0f, 35.5f, -14.5f)
                reflectiveQuadTo(390f, 290f)
                quadToRelative(0f, -21f, -14.5f, -35.5f)
                reflectiveQuadTo(340f, 240f)
                quadToRelative(-21f, 0f, -35.5f, 14.5f)
                reflectiveQuadTo(290f, 290f)
                quadToRelative(0f, 21f, 14.5f, 35.5f)
                reflectiveQuadTo(340f, 340f)
                close()
                moveToRelative(180f, 100f)
                horizontalLineToRelative(200f)
                lineTo(620f, 280f)
                lineTo(520f, 440f)
                close()
                moveToRelative(100f, 240f)
                lineToRelative(100f, -160f)
                horizontalLineTo(520f)
                lineToRelative(100f, 160f)
                close()
                moveTo(120f, 840f)
                verticalLineToRelative(-720f)
                horizontalLineToRelative(720f)
                verticalLineToRelative(720f)
                horizontalLineTo(120f)
                close()
            }
        }.build()
        
        return _Elevator!!
    }

private var _Elevator: ImageVector? = null

