package com.composables.icons.codicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Codicons.DebugLineByLine: ImageVector
    get() {
        if (_DebugLineByLine != null) return _DebugLineByLine!!
        
        _DebugLineByLine = ImageVector.Builder(
            name = "debug-line-by-line",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(3.62204f, 8.91401f)
                curveTo(4.49504f, 9.08801f, 5.40004f, 8.99901f, 6.22204f, 8.65801f)
                curveTo(7.04404f, 8.31701f, 7.74704f, 7.74101f, 8.24204f, 7.00101f)
                curveTo(8.73604f, 6.26101f, 9.00004f, 5.39101f, 9.00004f, 4.50101f)
                curveTo(9.00004f, 3.30801f, 8.52604f, 2.16301f, 7.68204f, 1.31901f)
                curveTo(6.83804f, 0.475007f, 5.69404f, 0.00100708f, 4.50004f, 0.00100708f)
                curveTo(3.61004f, 0.00100708f, 2.74004f, 0.265007f, 2.00004f, 0.759007f)
                curveTo(1.26004f, 1.25301f, 0.683038f, 1.95601f, 0.343038f, 2.77901f)
                curveTo(0.00203794f, 3.60001f, -0.0869621f, 4.50501f, 0.0860379f, 5.37801f)
                curveTo(0.259038f, 6.25101f, 0.688038f, 7.05301f, 1.31804f, 7.68201f)
                curveTo(1.94804f, 8.31101f, 2.74904f, 8.74001f, 3.62204f, 8.91401f)
                close()
                moveTo(3.00004f, 2.85001f)
                curveTo(3.00004f, 2.76301f, 3.02304f, 2.67701f, 3.06604f, 2.60201f)
                curveTo(3.10904f, 2.52601f, 3.17104f, 2.46301f, 3.24704f, 2.41901f)
                curveTo(3.32204f, 2.37501f, 3.40704f, 2.35101f, 3.49404f, 2.35001f)
                curveTo(3.58104f, 2.34901f, 3.66704f, 2.37101f, 3.74304f, 2.41301f)
                lineTo(6.71304f, 4.06301f)
                curveTo(6.79104f, 4.10601f, 6.85604f, 4.17001f, 6.90104f, 4.24601f)
                curveTo(6.94604f, 4.32301f, 6.97004f, 4.41001f, 6.97004f, 4.50001f)
                curveTo(6.97004f, 4.59001f, 6.94604f, 4.67701f, 6.90104f, 4.75301f)
                curveTo(6.85604f, 4.83001f, 6.79104f, 4.89301f, 6.71304f, 4.93601f)
                lineTo(3.74304f, 6.58601f)
                curveTo(3.66704f, 6.62801f, 3.58104f, 6.65001f, 3.49404f, 6.64901f)
                curveTo(3.40704f, 6.64801f, 3.32204f, 6.62401f, 3.24704f, 6.58001f)
                curveTo(3.17204f, 6.53601f, 3.11004f, 6.47301f, 3.06604f, 6.39701f)
                curveTo(3.02304f, 6.32101f, 3.00004f, 6.23601f, 3.00004f, 6.14901f)
                verticalLineTo(2.85001f)
                close()
                moveTo(15f, 7.50001f)
                curveTo(15f, 7.77601f, 14.776f, 8.00001f, 14.5f, 8.00001f)
                horizontalLineTo(8.74304f)
                curveTo(8.99704f, 7.69301f, 9.21804f, 7.35801f, 9.40004f, 7.00001f)
                horizontalLineTo(14.5f)
                curveTo(14.776f, 7.00001f, 15f, 7.22401f, 15f, 7.50001f)
                close()
                moveTo(9.97804f, 4.00001f)
                curveTo(9.94704f, 3.65701f, 9.88504f, 3.32201f, 9.79304f, 3.00001f)
                horizontalLineTo(14.5f)
                curveTo(14.776f, 3.00001f, 15f, 3.22401f, 15f, 3.50001f)
                curveTo(15f, 3.77601f, 14.776f, 4.00001f, 14.5f, 4.00001f)
                horizontalLineTo(9.97804f)
                close()
                moveTo(15f, 11.5f)
                curveTo(15f, 11.776f, 14.776f, 12f, 14.5f, 12f)
                horizontalLineTo(1.50004f)
                curveTo(1.22404f, 12f, 1.00004f, 11.776f, 1.00004f, 11.5f)
                curveTo(1.00004f, 11.224f, 1.22404f, 11f, 1.50004f, 11f)
                horizontalLineTo(14.5f)
                curveTo(14.776f, 11f, 15f, 11.224f, 15f, 11.5f)
                close()
            }
        }.build()
        
        return _DebugLineByLine!!
    }

private var _DebugLineByLine: ImageVector? = null

