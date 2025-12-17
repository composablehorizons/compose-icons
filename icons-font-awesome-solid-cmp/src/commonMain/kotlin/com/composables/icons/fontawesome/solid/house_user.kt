package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.HouseUser: ImageVector
    get() {
        if (_HouseUser != null) return _HouseUser!!
        
        _HouseUser = ImageVector.Builder(
            name = "house-user",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 576f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(570.69f, 236.27f)
                lineTo(512f, 184.44f)
                verticalLineTo(48f)
                arcToRelative(16f, 16f, 0f, false, false, -16f, -16f)
                horizontalLineTo(432f)
                arcToRelative(16f, 16f, 0f, false, false, -16f, 16f)
                verticalLineTo(99.67f)
                lineTo(314.78f, 10.3f)
                curveTo(308.5f, 4.61f, 296.53f, 0f, 288f, 0f)
                reflectiveCurveToRelative(-20.46f, 4.61f, -26.74f, 10.3f)
                lineToRelative(-256f, 226f)
                arcTo(18.27f, 18.27f, 0f, false, false, 0f, 248.2f)
                arcToRelative(18.64f, 18.64f, 0f, false, false, 4.09f, 10.71f)
                lineTo(25.5f, 282.7f)
                arcToRelative(21.14f, 21.14f, 0f, false, false, 12f, 5.3f)
                arcToRelative(21.67f, 21.67f, 0f, false, false, 10.69f, -4.11f)
                lineToRelative(15.9f, -14f)
                verticalLineTo(480f)
                arcToRelative(32f, 32f, 0f, false, false, 32f, 32f)
                horizontalLineTo(480f)
                arcToRelative(32f, 32f, 0f, false, false, 32f, -32f)
                verticalLineTo(269.88f)
                lineToRelative(15.91f, 14f)
                arcTo(21.94f, 21.94f, 0f, false, false, 538.63f, 288f)
                arcToRelative(20.89f, 20.89f, 0f, false, false, 11.87f, -5.31f)
                lineToRelative(21.41f, -23.81f)
                arcTo(21.64f, 21.64f, 0f, false, false, 576f, 248.19f)
                arcTo(21f, 21f, 0f, false, false, 570.69f, 236.27f)
                close()
                moveTo(288f, 176f)
                arcToRelative(64f, 64f, 0f, true, true, -64f, 64f)
                arcTo(64f, 64f, 0f, false, true, 288f, 176f)
                close()
                moveTo(400f, 448f)
                horizontalLineTo(176f)
                arcToRelative(16f, 16f, 0f, false, true, -16f, -16f)
                arcToRelative(96f, 96f, 0f, false, true, 96f, -96f)
                horizontalLineToRelative(64f)
                arcToRelative(96f, 96f, 0f, false, true, 96f, 96f)
                arcTo(16f, 16f, 0f, false, true, 400f, 448f)
                close()
            }
        }.build()
        
        return _HouseUser!!
    }

private var _HouseUser: ImageVector? = null

