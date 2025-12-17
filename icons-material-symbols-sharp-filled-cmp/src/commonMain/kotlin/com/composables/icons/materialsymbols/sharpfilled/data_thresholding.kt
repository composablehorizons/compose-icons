package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Data_thresholding: ImageVector
    get() {
        if (_Data_thresholding != null) return _Data_thresholding!!
        
        _Data_thresholding = ImageVector.Builder(
            name = "data_thresholding",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(269f, 640f)
                lineToRelative(-69f, 69f)
                verticalLineToRelative(51f)
                horizontalLineToRelative(34f)
                lineToRelative(120f, -120f)
                horizontalLineToRelative(-85f)
                close()
                moveToRelative(158f, 0f)
                lineTo(307f, 760f)
                horizontalLineToRelative(85f)
                lineToRelative(120f, -120f)
                horizontalLineToRelative(-85f)
                close()
                moveToRelative(149f, 0f)
                lineTo(456f, 760f)
                horizontalLineToRelative(85f)
                lineToRelative(120f, -120f)
                horizontalLineToRelative(-85f)
                close()
                moveToRelative(150f, 0f)
                lineTo(606f, 760f)
                horizontalLineToRelative(85f)
                lineToRelative(69f, -69f)
                verticalLineToRelative(-51f)
                horizontalLineToRelative(-34f)
                close()
                moveToRelative(-72f, -380f)
                lineTo(507f, 407f)
                lineToRelative(-80f, -80f)
                lineToRelative(-177f, 177f)
                lineToRelative(56f, 56f)
                lineToRelative(121f, -120f)
                lineToRelative(80f, 80f)
                lineToRelative(203f, -204f)
                lineToRelative(-56f, -56f)
                close()
                moveTo(120f, 840f)
                verticalLineToRelative(-720f)
                horizontalLineToRelative(720f)
                verticalLineToRelative(720f)
                horizontalLineTo(120f)
                close()
            }
        }.build()
        
        return _Data_thresholding!!
    }

private var _Data_thresholding: ImageVector? = null

