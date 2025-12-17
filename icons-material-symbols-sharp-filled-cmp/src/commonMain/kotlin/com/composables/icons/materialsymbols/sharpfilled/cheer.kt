package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Cheer: ImageVector
    get() {
        if (_Cheer != null) return _Cheer!!
        
        _Cheer = ImageVector.Builder(
            name = "cheer",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(312f, 209f)
                lineToRelative(-40f, -120f)
                lineToRelative(56f, -18f)
                lineToRelative(40f, 119f)
                lineToRelative(-56f, 19f)
                close()
                moveToRelative(138f, -49f)
                verticalLineToRelative(-120f)
                horizontalLineToRelative(60f)
                verticalLineToRelative(120f)
                horizontalLineToRelative(-60f)
                close()
                moveToRelative(198f, 49f)
                lineToRelative(-56f, -19f)
                lineToRelative(40f, -119f)
                lineToRelative(56f, 19f)
                lineToRelative(-40f, 119f)
                close()
                moveTo(874f, 920f)
                lineTo(590f, 877f)
                lineToRelative(-67f, -209f)
                lineToRelative(52f, -100f)
                lineToRelative(56f, 175f)
                lineToRelative(37f, -11f)
                lineToRelative(-119f, -372f)
                lineToRelative(127f, -75f)
                lineToRelative(188f, 355f)
                horizontalLineToRelative(56f)
                lineTo(874f, 920f)
                close()
                moveTo(86f, 920f)
                lineTo(40f, 640f)
                horizontalLineToRelative(56f)
                lineToRelative(188f, -355f)
                lineToRelative(127f, 75f)
                lineToRelative(-119f, 372f)
                lineToRelative(37f, 11f)
                lineToRelative(56f, -175f)
                lineToRelative(52f, 100f)
                lineToRelative(-67f, 209f)
                lineTo(86f, 920f)
                close()
            }
        }.build()
        
        return _Cheer!!
    }

private var _Cheer: ImageVector? = null

