package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Glucose: ImageVector
    get() {
        if (_Glucose != null) return _Glucose!!
        
        _Glucose = ImageVector.Builder(
            name = "glucose",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(576f, 880f)
                quadToRelative(-35f, 0f, -67f, -14.5f)
                reflectiveQuadTo(454f, 824f)
                lineTo(222f, 554f)
                lineToRelative(52f, -39f)
                quadToRelative(20f, -15f, 45f, -16f)
                reflectiveQuadToRelative(46f, 13f)
                lineToRelative(55f, 35f)
                verticalLineToRelative(-387f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(460f, 120f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(500f, 160f)
                verticalLineToRelative(360f)
                horizontalLineToRelative(60f)
                verticalLineToRelative(-200f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(600f, 280f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(640f, 320f)
                verticalLineToRelative(200f)
                horizontalLineToRelative(60f)
                verticalLineToRelative(-160f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(740f, 320f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(780f, 360f)
                verticalLineToRelative(160f)
                horizontalLineToRelative(60f)
                verticalLineToRelative(-80f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(880f, 400f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(920f, 440f)
                verticalLineToRelative(280f)
                quadToRelative(0f, 66f, -47f, 113f)
                reflectiveQuadTo(760f, 880f)
                horizontalLineTo(576f)
                close()
                moveTo(180f, 400f)
                quadToRelative(-59f, 0f, -99.5f, -40.5f)
                reflectiveQuadTo(40f, 262f)
                quadToRelative(0f, -34f, 13.5f, -59f)
                reflectiveQuadToRelative(63.5f, -82f)
                lineToRelative(63f, -72f)
                lineToRelative(63f, 73f)
                quadToRelative(51f, 59f, 64f, 83f)
                reflectiveQuadToRelative(13f, 57f)
                quadToRelative(0f, 57f, -41f, 97.5f)
                reflectiveQuadTo(180f, 400f)
                close()
            }
        }.build()
        
        return _Glucose!!
    }

private var _Glucose: ImageVector? = null

