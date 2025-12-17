package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.Outdent: ImageVector
    get() {
        if (_Outdent != null) return _Outdent!!
        
        _Outdent = ImageVector.Builder(
            name = "outdent",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 448f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(100.69f, 363.29f)
                curveToRelative(10f, 10f, 27.31f, 2.93f, 27.31f, -11.31f)
                verticalLineTo(160f)
                curveToRelative(0f, -14.32f, -17.33f, -21.31f, -27.31f, -11.31f)
                lineToRelative(-96f, 96f)
                arcToRelative(16f, 16f, 0f, false, false, 0f, 22.62f)
                close()
                moveTo(432f, 416f)
                horizontalLineTo(16f)
                arcToRelative(16f, 16f, 0f, false, false, -16f, 16f)
                verticalLineToRelative(32f)
                arcToRelative(16f, 16f, 0f, false, false, 16f, 16f)
                horizontalLineToRelative(416f)
                arcToRelative(16f, 16f, 0f, false, false, 16f, -16f)
                verticalLineToRelative(-32f)
                arcToRelative(16f, 16f, 0f, false, false, -16f, -16f)
                close()
                moveToRelative(3.17f, -128f)
                horizontalLineTo(204.83f)
                arcTo(12.82f, 12.82f, 0f, false, false, 192f, 300.83f)
                verticalLineToRelative(38.34f)
                arcTo(12.82f, 12.82f, 0f, false, false, 204.83f, 352f)
                horizontalLineToRelative(230.34f)
                arcTo(12.82f, 12.82f, 0f, false, false, 448f, 339.17f)
                verticalLineToRelative(-38.34f)
                arcTo(12.82f, 12.82f, 0f, false, false, 435.17f, 288f)
                close()
                moveToRelative(0f, -128f)
                horizontalLineTo(204.83f)
                arcTo(12.82f, 12.82f, 0f, false, false, 192f, 172.83f)
                verticalLineToRelative(38.34f)
                arcTo(12.82f, 12.82f, 0f, false, false, 204.83f, 224f)
                horizontalLineToRelative(230.34f)
                arcTo(12.82f, 12.82f, 0f, false, false, 448f, 211.17f)
                verticalLineToRelative(-38.34f)
                arcTo(12.82f, 12.82f, 0f, false, false, 435.17f, 160f)
                close()
                moveTo(432f, 32f)
                horizontalLineTo(16f)
                arcTo(16f, 16f, 0f, false, false, 0f, 48f)
                verticalLineToRelative(32f)
                arcToRelative(16f, 16f, 0f, false, false, 16f, 16f)
                horizontalLineToRelative(416f)
                arcToRelative(16f, 16f, 0f, false, false, 16f, -16f)
                verticalLineTo(48f)
                arcToRelative(16f, 16f, 0f, false, false, -16f, -16f)
                close()
            }
        }.build()
        
        return _Outdent!!
    }

private var _Outdent: ImageVector? = null

