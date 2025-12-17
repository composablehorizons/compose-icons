package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Notification_multiple: ImageVector
    get() {
        if (_Notification_multiple != null) return _Notification_multiple!!
        
        _Notification_multiple = ImageVector.Builder(
            name = "notification_multiple",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(40f, 880f)
                verticalLineToRelative(-600f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(520f)
                horizontalLineToRelative(600f)
                verticalLineToRelative(80f)
                horizontalLineTo(40f)
                close()
                moveToRelative(520f, -334f)
                lineTo(280f, 382f)
                verticalLineToRelative(258f)
                horizontalLineToRelative(560f)
                verticalLineToRelative(-258f)
                lineTo(560f, 546f)
                close()
                moveTo(200f, 720f)
                verticalLineToRelative(-468f)
                lineToRelative(360f, -212f)
                lineToRelative(80f, 47f)
                lineToRelative(-352f, 207f)
                lineToRelative(272f, 160f)
                lineToRelative(300f, -178f)
                lineToRelative(60f, 36f)
                verticalLineToRelative(408f)
                horizontalLineTo(200f)
                close()
                moveToRelative(360f, -320f)
                lineTo(448f, 288f)
                lineToRelative(56f, -56f)
                lineToRelative(56f, 56f)
                lineToRelative(142f, -142f)
                lineToRelative(56f, 56f)
                lineToRelative(-198f, 198f)
                close()
                moveToRelative(0f, 240f)
                horizontalLineToRelative(280f)
                horizontalLineToRelative(-560f)
                horizontalLineToRelative(280f)
                close()
            }
        }.build()
        
        return _Notification_multiple!!
    }

private var _Notification_multiple: ImageVector? = null

