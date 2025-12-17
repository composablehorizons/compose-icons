package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Web_traffic: ImageVector
    get() {
        if (_Web_traffic != null) return _Web_traffic!!
        
        _Web_traffic = ImageVector.Builder(
            name = "web_traffic",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(80f, 480f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(80f)
                horizontalLineTo(80f)
                close()
                moveToRelative(136f, 222f)
                lineToRelative(-56f, -58f)
                lineToRelative(84f, -84f)
                lineToRelative(58f, 56f)
                lineToRelative(-86f, 86f)
                close()
                moveToRelative(28f, -382f)
                lineToRelative(-84f, -84f)
                lineToRelative(56f, -58f)
                lineToRelative(86f, 86f)
                lineToRelative(-58f, 56f)
                close()
                moveToRelative(476f, 480f)
                lineTo(530f, 610f)
                lineToRelative(-50f, 150f)
                lineToRelative(-120f, -400f)
                lineToRelative(400f, 120f)
                lineToRelative(-148f, 52f)
                lineToRelative(188f, 188f)
                lineToRelative(-80f, 80f)
                close()
                moveTo(400f, 240f)
                verticalLineToRelative(-120f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(120f)
                horizontalLineToRelative(-80f)
                close()
                moveToRelative(236f, 80f)
                lineToRelative(-58f, -56f)
                lineToRelative(86f, -86f)
                lineToRelative(56f, 56f)
                lineToRelative(-84f, 86f)
                close()
            }
        }.build()
        
        return _Web_traffic!!
    }

private var _Web_traffic: ImageVector? = null

