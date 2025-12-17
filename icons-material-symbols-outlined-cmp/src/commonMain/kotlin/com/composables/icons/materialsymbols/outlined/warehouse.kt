package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Warehouse: ImageVector
    get() {
        if (_Warehouse != null) return _Warehouse!!
        
        _Warehouse = ImageVector.Builder(
            name = "warehouse",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(160f, 760f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-320f)
                horizontalLineToRelative(480f)
                verticalLineToRelative(320f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-426f)
                lineTo(480f, 206f)
                lineTo(160f, 334f)
                verticalLineToRelative(426f)
                close()
                moveToRelative(-80f, 80f)
                verticalLineToRelative(-560f)
                lineToRelative(400f, -160f)
                lineToRelative(400f, 160f)
                verticalLineToRelative(560f)
                horizontalLineTo(640f)
                verticalLineToRelative(-320f)
                horizontalLineTo(320f)
                verticalLineToRelative(320f)
                horizontalLineTo(80f)
                close()
                moveToRelative(280f, 0f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(-80f)
                close()
                moveToRelative(80f, -120f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(-80f)
                close()
                moveToRelative(80f, 120f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(-80f)
                close()
                moveTo(240f, 440f)
                horizontalLineToRelative(480f)
                horizontalLineToRelative(-480f)
                close()
            }
        }.build()
        
        return _Warehouse!!
    }

private var _Warehouse: ImageVector? = null

