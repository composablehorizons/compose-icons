package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Explosion: ImageVector
    get() {
        if (_Explosion != null) return _Explosion!!
        
        _Explosion = ImageVector.Builder(
            name = "explosion",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(480f, 679f)
                lineToRelative(59f, -59f)
                horizontalLineToRelative(81f)
                verticalLineToRelative(-81f)
                lineToRelative(59f, -59f)
                lineToRelative(-59f, -59f)
                verticalLineToRelative(-81f)
                horizontalLineToRelative(-81f)
                lineToRelative(-59f, -59f)
                lineToRelative(-59f, 59f)
                horizontalLineToRelative(-81f)
                verticalLineToRelative(81f)
                lineToRelative(-59f, 59f)
                lineToRelative(59f, 59f)
                verticalLineToRelative(81f)
                horizontalLineToRelative(81f)
                lineToRelative(59f, 59f)
                close()
                moveToRelative(0f, 253f)
                lineTo(346f, 800f)
                horizontalLineTo(160f)
                verticalLineToRelative(-186f)
                lineTo(28f, 480f)
                lineToRelative(132f, -134f)
                verticalLineToRelative(-186f)
                horizontalLineToRelative(186f)
                lineToRelative(134f, -132f)
                lineToRelative(134f, 132f)
                horizontalLineToRelative(186f)
                verticalLineToRelative(186f)
                lineToRelative(132f, 134f)
                lineToRelative(-132f, 134f)
                verticalLineToRelative(186f)
                horizontalLineTo(614f)
                lineTo(480f, 932f)
                close()
                moveToRelative(0f, -112f)
                lineToRelative(100f, -100f)
                horizontalLineToRelative(140f)
                verticalLineToRelative(-140f)
                lineToRelative(100f, -100f)
                lineToRelative(-100f, -100f)
                verticalLineToRelative(-140f)
                horizontalLineTo(580f)
                lineTo(480f, 140f)
                lineTo(380f, 240f)
                horizontalLineTo(240f)
                verticalLineToRelative(140f)
                lineTo(140f, 480f)
                lineToRelative(100f, 100f)
                verticalLineToRelative(140f)
                horizontalLineToRelative(140f)
                lineToRelative(100f, 100f)
                close()
                moveToRelative(0f, -340f)
                close()
            }
        }.build()
        
        return _Explosion!!
    }

private var _Explosion: ImageVector? = null

