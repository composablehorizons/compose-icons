package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.`5k`: ImageVector
    get() {
        if (_5k != null) return _5k!!
        
        _5k = ImageVector.Builder(
            name = "5k",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(520f, 600f)
                horizontalLineToRelative(60f)
                verticalLineToRelative(-90f)
                lineToRelative(70f, 90f)
                horizontalLineToRelative(70f)
                lineToRelative(-90f, -120f)
                lineToRelative(90f, -120f)
                horizontalLineToRelative(-70f)
                lineToRelative(-70f, 90f)
                verticalLineToRelative(-90f)
                horizontalLineToRelative(-60f)
                verticalLineToRelative(240f)
                close()
                moveToRelative(-260f, 0f)
                horizontalLineToRelative(180f)
                verticalLineToRelative(-140f)
                horizontalLineTo(320f)
                verticalLineToRelative(-40f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(-60f)
                horizontalLineTo(260f)
                verticalLineToRelative(140f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(40f)
                horizontalLineTo(260f)
                verticalLineToRelative(60f)
                close()
                moveTo(120f, 840f)
                verticalLineToRelative(-720f)
                horizontalLineToRelative(720f)
                verticalLineToRelative(720f)
                horizontalLineTo(120f)
                close()
            }
        }.build()
        
        return _5k!!
    }

private var _5k: ImageVector? = null

