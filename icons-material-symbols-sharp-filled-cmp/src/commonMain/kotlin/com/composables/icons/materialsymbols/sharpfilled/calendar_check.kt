package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Calendar_check: ImageVector
    get() {
        if (_Calendar_check != null) return _Calendar_check!!
        
        _Calendar_check = ImageVector.Builder(
            name = "calendar_check",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(120f, 880f)
                verticalLineToRelative(-720f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(320f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(335f)
                lineToRelative(-80f, 80f)
                verticalLineToRelative(-175f)
                horizontalLineTo(200f)
                verticalLineToRelative(400f)
                horizontalLineToRelative(248f)
                lineToRelative(80f, 80f)
                horizontalLineTo(120f)
                close()
                moveToRelative(542f, 20f)
                lineTo(520f, 758f)
                lineToRelative(56f, -56f)
                lineToRelative(85f, 85f)
                lineToRelative(170f, -170f)
                lineToRelative(56f, 57f)
                lineTo(662f, 900f)
                close()
            }
        }.build()
        
        return _Calendar_check!!
    }

private var _Calendar_check: ImageVector? = null

