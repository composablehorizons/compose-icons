package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.Retweet: ImageVector
    get() {
        if (_Retweet != null) return _Retweet!!
        
        _Retweet = ImageVector.Builder(
            name = "retweet",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 640f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(629.657f, 343.598f)
                lineTo(528.971f, 444.284f)
                curveToRelative(-9.373f, 9.372f, -24.568f, 9.372f, -33.941f, 0f)
                lineTo(394.343f, 343.598f)
                curveToRelative(-9.373f, -9.373f, -9.373f, -24.569f, 0f, -33.941f)
                lineToRelative(10.823f, -10.823f)
                curveToRelative(9.562f, -9.562f, 25.133f, -9.34f, 34.419f, 0.492f)
                lineTo(480f, 342.118f)
                verticalLineTo(160f)
                horizontalLineTo(292.451f)
                arcToRelative(24.005f, 24.005f, 0f, false, true, -16.971f, -7.029f)
                lineToRelative(-16f, -16f)
                curveTo(244.361f, 121.851f, 255.069f, 96f, 276.451f, 96f)
                horizontalLineTo(520f)
                curveToRelative(13.255f, 0f, 24f, 10.745f, 24f, 24f)
                verticalLineToRelative(222.118f)
                lineToRelative(40.416f, -42.792f)
                curveToRelative(9.285f, -9.831f, 24.856f, -10.054f, 34.419f, -0.492f)
                lineToRelative(10.823f, 10.823f)
                curveToRelative(9.372f, 9.372f, 9.372f, 24.569f, -0.001f, 33.941f)
                close()
                moveToRelative(-265.138f, 15.431f)
                arcTo(23.999f, 23.999f, 0f, false, false, 347.548f, 352f)
                horizontalLineTo(160f)
                verticalLineTo(169.881f)
                lineToRelative(40.416f, 42.792f)
                curveToRelative(9.286f, 9.831f, 24.856f, 10.054f, 34.419f, 0.491f)
                lineToRelative(10.822f, -10.822f)
                curveToRelative(9.373f, -9.373f, 9.373f, -24.569f, 0f, -33.941f)
                lineTo(144.971f, 67.716f)
                curveToRelative(-9.373f, -9.373f, -24.569f, -9.373f, -33.941f, 0f)
                lineTo(10.343f, 168.402f)
                curveToRelative(-9.373f, 9.373f, -9.373f, 24.569f, 0f, 33.941f)
                lineToRelative(10.822f, 10.822f)
                curveToRelative(9.562f, 9.562f, 25.133f, 9.34f, 34.419f, -0.491f)
                lineTo(96f, 169.881f)
                verticalLineTo(392f)
                curveToRelative(0f, 13.255f, 10.745f, 24f, 24f, 24f)
                horizontalLineToRelative(243.549f)
                curveToRelative(21.382f, 0f, 32.09f, -25.851f, 16.971f, -40.971f)
                lineToRelative(-16.001f, -16f)
                close()
            }
        }.build()
        
        return _Retweet!!
    }

private var _Retweet: ImageVector? = null

