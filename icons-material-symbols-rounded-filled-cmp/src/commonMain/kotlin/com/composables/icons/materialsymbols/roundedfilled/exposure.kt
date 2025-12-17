package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Exposure: ImageVector
    get() {
        if (_Exposure != null) return _Exposure!!
        
        _Exposure = ImageVector.Builder(
            name = "exposure",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(200f, 840f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(120f, 760f)
                verticalLineToRelative(-560f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(200f, 120f)
                horizontalLineToRelative(560f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(840f, 200f)
                verticalLineToRelative(560f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(760f, 840f)
                horizontalLineTo(200f)
                close()
                moveToRelative(0f, -80f)
                horizontalLineToRelative(560f)
                verticalLineToRelative(-560f)
                lineTo(200f, 760f)
                close()
                moveToRelative(380f, -120f)
                horizontalLineToRelative(-50f)
                quadToRelative(-13f, 0f, -21.5f, -8.5f)
                reflectiveQuadTo(500f, 610f)
                quadToRelative(0f, -13f, 8.5f, -21.5f)
                reflectiveQuadTo(530f, 580f)
                horizontalLineToRelative(50f)
                verticalLineToRelative(-50f)
                quadToRelative(0f, -13f, 8.5f, -21.5f)
                reflectiveQuadTo(610f, 500f)
                quadToRelative(13f, 0f, 21.5f, 8.5f)
                reflectiveQuadTo(640f, 530f)
                verticalLineToRelative(50f)
                horizontalLineToRelative(50f)
                quadToRelative(13f, 0f, 21.5f, 8.5f)
                reflectiveQuadTo(720f, 610f)
                quadToRelative(0f, 13f, -8.5f, 21.5f)
                reflectiveQuadTo(690f, 640f)
                horizontalLineToRelative(-50f)
                verticalLineToRelative(50f)
                quadToRelative(0f, 13f, -8.5f, 21.5f)
                reflectiveQuadTo(610f, 720f)
                quadToRelative(-13f, 0f, -21.5f, -8.5f)
                reflectiveQuadTo(580f, 690f)
                verticalLineToRelative(-50f)
                close()
                moveTo(410f, 340f)
                quadToRelative(13f, 0f, 21.5f, -8.5f)
                reflectiveQuadTo(440f, 310f)
                quadToRelative(0f, -13f, -8.5f, -21.5f)
                reflectiveQuadTo(410f, 280f)
                horizontalLineTo(270f)
                quadToRelative(-13f, 0f, -21.5f, 8.5f)
                reflectiveQuadTo(240f, 310f)
                quadToRelative(0f, 13f, 8.5f, 21.5f)
                reflectiveQuadTo(270f, 340f)
                horizontalLineToRelative(140f)
                close()
            }
        }.build()
        
        return _Exposure!!
    }

private var _Exposure: ImageVector? = null

