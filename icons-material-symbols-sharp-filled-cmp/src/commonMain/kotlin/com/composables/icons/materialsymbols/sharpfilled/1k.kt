package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.`1k`: ImageVector
    get() {
        if (_1k != null) return _1k!!
        
        _1k = ImageVector.Builder(
            name = "1k",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(480f, 600f)
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
                moveToRelative(-140f, 0f)
                horizontalLineToRelative(60f)
                verticalLineToRelative(-240f)
                horizontalLineTo(280f)
                verticalLineToRelative(60f)
                horizontalLineToRelative(60f)
                verticalLineToRelative(180f)
                close()
                moveTo(120f, 840f)
                verticalLineToRelative(-720f)
                horizontalLineToRelative(720f)
                verticalLineToRelative(720f)
                horizontalLineTo(120f)
                close()
            }
        }.build()
        
        return _1k!!
    }

private var _1k: ImageVector? = null

