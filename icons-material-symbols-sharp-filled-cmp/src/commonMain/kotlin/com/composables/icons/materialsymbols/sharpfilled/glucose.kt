package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Glucose: ImageVector
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
                moveTo(502f, 880f)
                lineTo(222f, 554f)
                lineToRelative(96f, -72f)
                lineToRelative(102f, 65f)
                verticalLineToRelative(-427f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(400f)
                horizontalLineToRelative(60f)
                verticalLineToRelative(-240f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(240f)
                horizontalLineToRelative(60f)
                verticalLineToRelative(-200f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(200f)
                horizontalLineToRelative(60f)
                verticalLineToRelative(-120f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(480f)
                horizontalLineTo(502f)
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

