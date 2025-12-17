package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Fiber_new: ImageVector
    get() {
        if (_Fiber_new != null) return _Fiber_new!!
        
        _Fiber_new = ImageVector.Builder(
            name = "fiber_new",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(40f, 800f)
                verticalLineToRelative(-640f)
                horizontalLineToRelative(880f)
                verticalLineToRelative(640f)
                horizontalLineTo(40f)
                close()
                moveToRelative(100f, -200f)
                horizontalLineToRelative(50f)
                verticalLineToRelative(-140f)
                lineToRelative(102f, 140f)
                horizontalLineToRelative(48f)
                verticalLineToRelative(-240f)
                horizontalLineToRelative(-50f)
                verticalLineToRelative(140f)
                lineTo(190f, 360f)
                horizontalLineToRelative(-50f)
                verticalLineToRelative(240f)
                close()
                moveToRelative(240f, 0f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(-50f)
                horizontalLineTo(440f)
                verticalLineToRelative(-44f)
                horizontalLineToRelative(100f)
                verticalLineToRelative(-50f)
                horizontalLineTo(440f)
                verticalLineToRelative(-46f)
                horizontalLineToRelative(100f)
                verticalLineToRelative(-50f)
                horizontalLineTo(380f)
                verticalLineToRelative(240f)
                close()
                moveToRelative(200f, 0f)
                horizontalLineToRelative(240f)
                verticalLineToRelative(-240f)
                horizontalLineToRelative(-50f)
                verticalLineToRelative(180f)
                horizontalLineToRelative(-44f)
                verticalLineToRelative(-140f)
                horizontalLineToRelative(-50f)
                verticalLineToRelative(140f)
                horizontalLineToRelative(-46f)
                verticalLineToRelative(-180f)
                horizontalLineToRelative(-50f)
                verticalLineToRelative(240f)
                close()
            }
        }.build()
        
        return _Fiber_new!!
    }

private var _Fiber_new: ImageVector? = null

