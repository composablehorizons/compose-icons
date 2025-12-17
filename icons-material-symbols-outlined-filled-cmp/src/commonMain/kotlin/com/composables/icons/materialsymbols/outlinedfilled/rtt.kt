package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Rtt: ImageVector
    get() {
        if (_Rtt != null) return _Rtt!!
        
        _Rtt = ImageVector.Builder(
            name = "rtt",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(365f, 840f)
                lineToRelative(16f, -102f)
                horizontalLineToRelative(93f)
                lineToRelative(82f, -516f)
                horizontalLineTo(456f)
                lineToRelative(-29f, 180f)
                horizontalLineTo(321f)
                lineToRelative(45f, -282f)
                horizontalLineToRelative(519f)
                lineToRelative(-45f, 282f)
                horizontalLineTo(734f)
                lineToRelative(28f, -180f)
                horizontalLineTo(662f)
                lineToRelative(-82f, 516f)
                horizontalLineToRelative(93f)
                lineToRelative(-16f, 102f)
                horizontalLineTo(365f)
                close()
                moveTo(150f, 280f)
                lineToRelative(13f, -80f)
                horizontalLineToRelative(150f)
                lineToRelative(-13f, 80f)
                horizontalLineTo(150f)
                close()
                moveToRelative(-25f, 160f)
                lineToRelative(13f, -80f)
                horizontalLineToRelative(150f)
                lineToRelative(-13f, 80f)
                horizontalLineTo(125f)
                close()
                moveTo(75f, 760f)
                lineToRelative(12f, -80f)
                horizontalLineToRelative(250f)
                lineToRelative(-12f, 80f)
                horizontalLineTo(75f)
                close()
                moveToRelative(25f, -160f)
                lineToRelative(13f, -80f)
                horizontalLineToRelative(250f)
                lineToRelative(-13f, 80f)
                horizontalLineTo(100f)
                close()
            }
        }.build()
        
        return _Rtt!!
    }

private var _Rtt: ImageVector? = null

