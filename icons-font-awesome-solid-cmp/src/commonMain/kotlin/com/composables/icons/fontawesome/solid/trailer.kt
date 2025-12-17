package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.Trailer: ImageVector
    get() {
        if (_Trailer != null) return _Trailer!!
        
        _Trailer = ImageVector.Builder(
            name = "trailer",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 640f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(624f, 320f)
                horizontalLineTo(544f)
                verticalLineTo(80f)
                arcToRelative(16f, 16f, 0f, false, false, -16f, -16f)
                horizontalLineTo(16f)
                arcTo(16f, 16f, 0f, false, false, 0f, 80f)
                verticalLineTo(368f)
                arcToRelative(16f, 16f, 0f, false, false, 16f, 16f)
                horizontalLineTo(65.61f)
                curveToRelative(7.83f, -54.21f, 54f, -96f, 110.39f, -96f)
                reflectiveCurveToRelative(102.56f, 41.79f, 110.39f, 96f)
                horizontalLineTo(624f)
                arcToRelative(16f, 16f, 0f, false, false, 16f, -16f)
                verticalLineTo(336f)
                arcTo(16f, 16f, 0f, false, false, 624f, 320f)
                close()
                moveTo(96f, 243.68f)
                arcToRelative(176.29f, 176.29f, 0f, false, false, -32f, 20.71f)
                verticalLineTo(136f)
                arcToRelative(8f, 8f, 0f, false, true, 8f, -8f)
                horizontalLineTo(88f)
                arcToRelative(8f, 8f, 0f, false, true, 8f, 8f)
                close()
                moveToRelative(96f, -18.54f)
                curveToRelative(-5.31f, -0.49f, -10.57f, -1.14f, -16f, -1.14f)
                reflectiveCurveToRelative(-10.69f, 0.65f, -16f, 1.14f)
                verticalLineTo(136f)
                arcToRelative(8f, 8f, 0f, false, true, 8f, -8f)
                horizontalLineToRelative(16f)
                arcToRelative(8f, 8f, 0f, false, true, 8f, 8f)
                close()
                moveToRelative(96f, 39.25f)
                arcToRelative(176.29f, 176.29f, 0f, false, false, -32f, -20.71f)
                verticalLineTo(136f)
                arcToRelative(8f, 8f, 0f, false, true, 8f, -8f)
                horizontalLineToRelative(16f)
                arcToRelative(8f, 8f, 0f, false, true, 8f, 8f)
                close()
                moveTo(384f, 320f)
                horizontalLineTo(352f)
                verticalLineTo(136f)
                arcToRelative(8f, 8f, 0f, false, true, 8f, -8f)
                horizontalLineToRelative(16f)
                arcToRelative(8f, 8f, 0f, false, true, 8f, 8f)
                close()
                moveToRelative(96f, 0f)
                horizontalLineTo(448f)
                verticalLineTo(136f)
                arcToRelative(8f, 8f, 0f, false, true, 8f, -8f)
                horizontalLineToRelative(16f)
                arcToRelative(8f, 8f, 0f, false, true, 8f, 8f)
                close()
                moveToRelative(-304f, 0f)
                arcToRelative(80f, 80f, 0f, true, false, 80f, 80f)
                arcTo(80f, 80f, 0f, false, false, 176f, 320f)
                close()
                moveToRelative(0f, 112f)
                arcToRelative(32f, 32f, 0f, true, true, 32f, -32f)
                arcTo(32f, 32f, 0f, false, true, 176f, 432f)
                close()
            }
        }.build()
        
        return _Trailer!!
    }

private var _Trailer: ImageVector? = null

