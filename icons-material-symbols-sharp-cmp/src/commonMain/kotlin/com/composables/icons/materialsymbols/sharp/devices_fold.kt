package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Devices_fold: ImageVector
    get() {
        if (_Devices_fold != null) return _Devices_fold!!
        
        _Devices_fold = ImageVector.Builder(
            name = "devices_fold",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(400f, 840f)
                verticalLineToRelative(-721f)
                lineToRelative(280f, -122f)
                verticalLineToRelative(123f)
                horizontalLineToRelative(200f)
                verticalLineToRelative(720f)
                horizontalLineTo(400f)
                close()
                moveToRelative(80f, -121f)
                lineToRelative(120f, -52f)
                verticalLineToRelative(-547f)
                lineToRelative(-120f, 52f)
                verticalLineToRelative(547f)
                close()
                moveToRelative(107f, 41f)
                horizontalLineToRelative(213f)
                verticalLineToRelative(-560f)
                horizontalLineTo(680f)
                verticalLineToRelative(521f)
                lineToRelative(-93f, 39f)
                close()
                moveToRelative(-107f, -41f)
                verticalLineToRelative(-547f)
                verticalLineToRelative(547f)
                close()
                moveTo(80f, 200f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(80f)
                horizontalLineTo(80f)
                close()
                moveToRelative(0f, 640f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(80f)
                horizontalLineTo(80f)
                close()
                moveToRelative(0f, -160f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(80f)
                horizontalLineTo(80f)
                close()
                moveToRelative(0f, -160f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(80f)
                horizontalLineTo(80f)
                close()
                moveToRelative(0f, -160f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(80f)
                horizontalLineTo(80f)
                close()
                moveToRelative(160f, -160f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(-80f)
                close()
                moveToRelative(0f, 640f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(-80f)
                close()
            }
        }.build()
        
        return _Devices_fold!!
    }

private var _Devices_fold: ImageVector? = null

