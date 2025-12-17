package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.HandPaper: ImageVector
    get() {
        if (_HandPaper != null) return _HandPaper!!
        
        _HandPaper = ImageVector.Builder(
            name = "hand-paper",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 448f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(408.781f, 128.007f)
                curveTo(386.356f, 127.578f, 368f, 146.36f, 368f, 168.79f)
                verticalLineTo(256f)
                horizontalLineToRelative(-8f)
                verticalLineTo(79.79f)
                curveToRelative(0f, -22.43f, -18.356f, -41.212f, -40.781f, -40.783f)
                curveTo(297.488f, 39.423f, 280f, 57.169f, 280f, 79f)
                verticalLineToRelative(177f)
                horizontalLineToRelative(-8f)
                verticalLineTo(40.79f)
                curveTo(272f, 18.36f, 253.644f, -0.422f, 231.219f, 0.007f)
                curveTo(209.488f, 0.423f, 192f, 18.169f, 192f, 40f)
                verticalLineToRelative(216f)
                horizontalLineToRelative(-8f)
                verticalLineTo(80.79f)
                curveToRelative(0f, -22.43f, -18.356f, -41.212f, -40.781f, -40.783f)
                curveTo(121.488f, 40.423f, 104f, 58.169f, 104f, 80f)
                verticalLineToRelative(235.992f)
                lineToRelative(-31.648f, -43.519f)
                curveToRelative(-12.993f, -17.866f, -38.009f, -21.817f, -55.877f, -8.823f)
                curveToRelative(-17.865f, 12.994f, -21.815f, 38.01f, -8.822f, 55.877f)
                lineToRelative(125.601f, 172.705f)
                arcTo(48f, 48f, 0f, false, false, 172.073f, 512f)
                horizontalLineToRelative(197.59f)
                curveToRelative(22.274f, 0f, 41.622f, -15.324f, 46.724f, -37.006f)
                lineToRelative(26.508f, -112.66f)
                arcToRelative(192.011f, 192.011f, 0f, false, false, 5.104f, -43.975f)
                verticalLineTo(168f)
                curveToRelative(0.001f, -21.831f, -17.487f, -39.577f, -39.218f, -39.993f)
                close()
            }
        }.build()
        
        return _HandPaper!!
    }

private var _HandPaper: ImageVector? = null

