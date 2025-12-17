package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Elevation: ImageVector
    get() {
        if (_Elevation != null) return _Elevation!!
        
        _Elevation = ImageVector.Builder(
            name = "elevation",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(82f, 840f)
                lineToRelative(258f, -360f)
                horizontalLineToRelative(202f)
                lineToRelative(298f, -348f)
                verticalLineToRelative(708f)
                horizontalLineTo(82f)
                close()
                moveToRelative(70f, -233f)
                lineToRelative(-64f, -46f)
                lineToRelative(172f, -241f)
                horizontalLineToRelative(202f)
                lineToRelative(188f, -219f)
                lineToRelative(60f, 52f)
                lineToRelative(-212f, 247f)
                horizontalLineTo(300f)
                lineTo(152f, 607f)
                close()
                moveToRelative(86f, 153f)
                horizontalLineToRelative(522f)
                verticalLineToRelative(-412f)
                lineTo(578f, 560f)
                horizontalLineTo(380f)
                lineTo(238f, 760f)
                close()
                moveToRelative(522f, 0f)
                close()
            }
        }.build()
        
        return _Elevation!!
    }

private var _Elevation: ImageVector? = null

